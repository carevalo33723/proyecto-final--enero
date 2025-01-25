package ar.com.SgCampo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Serivice.ICentroOperativoService;

@Controller
public class CentroOperativo {
	@Autowired
	ICentroOperativoService dato;
	
	
	
	
	@GetMapping("/AltaCentro")
	public String crear(Model model) {
		Centro_Operativo nuevoCentro = new Centro_Operativo();		
		model.addAttribute("CentroO", nuevoCentro);
		/* model.addAttribute("accion", "guardar"); */		
		return "Centro.Opertivo/AltaCentro";
	}

	@PostMapping("/guardar")
	public String guardar(Model model, Centro_Operativo CentroParaGuardar) {		
		Centro_Operativo centroRepetidoNombre = dato.findByNombre(CentroParaGuardar.getNombre());//Busca si ya existe el cliente(por nombre de usuario)
		if (centroRepetidoNombre != null) {			
			return "redirect:/CentroOperativo";//si ya existe el usuario, regresa a la pantalla anterior, pero no guarda el usuario.(metodo listarLoguin)
		}
		dato.save(CentroParaGuardar);		
		return "redirect:/CentroOperativo";//Guarda el nuevo usuario y regresa a la pantalla anterior.(metodo listarLoguin)
	}
	
	@GetMapping("/editar/{id}")
	public String editar (@PathVariable int id,Model model) {
		
		Optional<Centro_Operativo> datito = dato.Idlistar(id);
		model.addAttribute("CentroO", datito);
		return "Centro.Opertivo/AltaCentro";
	}
	
}
