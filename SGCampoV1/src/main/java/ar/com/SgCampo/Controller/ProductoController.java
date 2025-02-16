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
		return "Producto/alta-producto";
	}
	
	@PostMapping("/guardarProducto")
	public String guardar(Model model, Producto Pro) {		
		Producto centroRepetidoNombre = dato.findByNombreProducto(Pro.getNombre());//Busca si ya existe el cliente(por nombre de usuario)
		if (centroRepetidoNombre != null) {			
			return "redirect:/Producto";//si ya existe el producto, regresa a la pantalla anterior.
		}
		dato.save(Pro);		
		return "redirect:/Producto";//Guarda el nuevo producto y regresa a la pantalla anterior.
	}

}
