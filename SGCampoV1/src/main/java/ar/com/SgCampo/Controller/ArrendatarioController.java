package ar.com.SgCampo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.SgCampo.Model.Entity.Arrendatario;

import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Serivice.IArrendatarioService;
import ar.com.SgCampo.Model.Serivice.ISociosService;

@Controller
public class ArrendatarioController {
	
	@Autowired
	IArrendatarioService arre;
	
	@Autowired
	ISociosService dato;
	
	@GetMapping("/AltaArrendatario")
	public String crear(Model model) {		
		// Obtener la lista de centros operativos
	    List<Socio> listaSocios = dato.listar();
	    
	    // Agregar la lista al modelo
	    model.addAttribute("listaCentros", listaSocios);

		
		Arrendatario nuevoCentro = new Arrendatario();		
		model.addAttribute("CentroO", nuevoCentro);
		
		
		/* model.addAttribute("accion", "guardar"); */		
		return "Arrendatario/AltaArre";
	}
	
	@PostMapping("/guardarArre")
	public String guardar(Model model, Arrendatario SocioParaGuardar,@RequestParam("Socio.id") int SocioId) {		
		Arrendatario arreRepetidoNombre = arre.findByNombre(SocioParaGuardar.getNombre());//Busca si ya existe el arrendatario
		if (arreRepetidoNombre != null) {			
			return "redirect:/Arrendatario";//si ya existe el usuario, regresa a la pantalla anterior, pero no guarda el usuario.(metodo listarLoguin)
		}
		Socio centroOperativo = dato.findById(SocioId);
	    SocioParaGuardar.setSocio(centroOperativo);
		arre.save(SocioParaGuardar);		
		return "redirect:/Arrendatario";//Guarda el nuevo usuario y regresa al hoe con el pad /socios
	}
}
