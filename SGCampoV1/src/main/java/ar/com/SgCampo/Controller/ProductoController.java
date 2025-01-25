package ar.com.SgCampo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import ar.com.SgCampo.Model.Entity.Producto;
import ar.com.SgCampo.Model.Serivice.IProductoService;



@Controller
public class ProductoController {
	
	@Autowired
	IProductoService dato;
	
	
	
	@GetMapping("/AltaProducto")
	public String crear(Model model) {
		Producto nuevoCentro = new Producto();		
		model.addAttribute("Produ", nuevoCentro);
		/* model.addAttribute("accion", "guardar"); */		
		return "Producto/AltaProducto";
	}
	
	@PostMapping("/guardarProducto")
	public String guardar(Model model, Producto Pro) {		
		Producto centroRepetidoNombre = dato.findByNombreProducto(Pro.getNombreProducto());//Busca si ya existe el cliente(por nombre de usuario)
		if (centroRepetidoNombre != null) {			
			return "redirect:/Producto";//si ya existe el usuario, regresa a la pantalla anterior, pero no guarda el usuario.(metodo listarLoguin)
		}
		dato.save(Pro);		
		return "redirect:/Producto";//Guarda el nuevo usuario y regresa a la pantalla anterior.(metodo listarLoguin)
	}

}
