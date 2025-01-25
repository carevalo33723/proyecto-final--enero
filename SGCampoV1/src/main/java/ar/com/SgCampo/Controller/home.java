
package ar.com.SgCampo.Controller;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.SgCampo.Model.Entity.Arrendatario;
import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Entity.Cosecha;
import ar.com.SgCampo.Model.Entity.Producto;
import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Service.Impl.ArrendatarioService;
import ar.com.SgCampo.Model.Service.Impl.CentroOperativoSerivice;
import ar.com.SgCampo.Model.Service.Impl.CosechaServiceImpl;
import ar.com.SgCampo.Model.Service.Impl.ProductoSeriviceImpl;
import ar.com.SgCampo.Model.Service.Impl.SocioService;

@Controller
public class home {
	@Autowired
	CentroOperativoSerivice centro;
	
	@Autowired
	SocioService soci;
	
	@Autowired
	ArrendatarioService arre;
	
	@Autowired
	ProductoSeriviceImpl pro;
	
	@Autowired
	CosechaServiceImpl cosecha;
    
    @GetMapping("/")
    public String home() {
        return "Layaut/Base";  // Corrección aquí
    }
    
    @GetMapping("/CentroOperativo")
    public String centroOperativo(Model model) {
    	List<Centro_Operativo>operativo= centro.listar();
    	
    	model.addAttribute("centroOpera", operativo);
    	
        return "Centro.Opertivo/CentroOperativo"; // Nombre de la vista Thymeleaf
    }
    
    @GetMapping("/Socios")
    public String Socios(Model model,@RequestParam(defaultValue = "0") int page) {
		
		  List<Socio>operativo= soci.listar(); 
		  model.addAttribute("Objeto", operativo);
		 
    	
    
        return "Socios/ListaSocios"; // Nombre de la vista Thymeleaf
    }
    
    @GetMapping("/Arrendatario")
    public String arrendatario (Model model) {
    	List<Arrendatario> operativo = arre.listar();
    	model.addAttribute("arren", operativo);
    	
    	return "Arrendatario/ListaArrendatario";
    }
    @GetMapping("/Producto")
    public String producto (Model model) {
    	List<Producto> operativo = pro.listar();
    	model.addAttribute("produ", operativo);
    	
    	return "Producto/ListProducto";
    }
    
    @GetMapping("/Cosecha")
    public String cosecha (Model model) {
    	List<Cosecha> operativo = cosecha.listar();
    	model.addAttribute("cose", operativo);
    	
    	return "Cosecha/ListaCosecha";
    }
    
}

