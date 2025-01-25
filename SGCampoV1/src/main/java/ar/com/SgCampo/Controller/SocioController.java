package ar.com.SgCampo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Serivice.ICentroOperativoService;
import ar.com.SgCampo.Model.Serivice.ISociosService;

@Controller
public class SocioController {
	
	@Autowired
	ISociosService dato;
	@Autowired
	ICentroOperativoService centro;
	
	@GetMapping("/AltaSocio")
	public String crear(Model model) {		
		// Obtener la lista de centros operativos
	    List<Centro_Operativo> listaCentros = centro.listar();
	    
	    // Agregar la lista al modelo
	    model.addAttribute("listaCentros", listaCentros);

		
		Socio nuevoCentro = new Socio();		
		model.addAttribute("CentroO", nuevoCentro);
		
		
		/* model.addAttribute("accion", "guardar"); */		
		return "Socios/AltaSocio";
	}
	@PostMapping("/guardarSocio")
	public String guardar(Model model, Socio SocioParaGuardar,@RequestParam("centroOperativo.id") int centroOperativoId) {		
		Socio centroRepetidoNombre = dato.findByNombre(SocioParaGuardar.getNombre());//Busca si ya existe el cliente(por nombre de usuario)
		if (centroRepetidoNombre != null) {			
			return "redirect:/Socios";//si ya existe el usuario, regresa a la pantalla anterior, pero no guarda el usuario.(metodo listarLoguin)
		}
		Centro_Operativo centroOperativo = centro.findById(centroOperativoId);
	    SocioParaGuardar.setCentroOperativo(centroOperativo);
		dato.save(SocioParaGuardar);		
		return "redirect:/Socios";//Guarda el nuevo usuario y regresa al hoe con el pad /socios
	}
	
	@GetMapping("/editarSocio/{id}")
	public String editar (@PathVariable int id,Model model) {
		
		// Obtener la lista de centros operativos
	    List<Centro_Operativo> listaCentros = centro.listar();
	    
	    // Agregar la lista al modelo
	    model.addAttribute("listaCentros", listaCentros);
		
		Optional<Socio> datito = dato.Idlistar(id);
		model.addAttribute("CentroO", datito);
		return "Socios/AltaSocio";
	}
}
