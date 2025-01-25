package ar.com.SgCampo.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.com.SgCampo.Model.Entity.Arrendatario;
import ar.com.SgCampo.Model.Entity.ArrendatarioDTO;
import ar.com.SgCampo.Model.Entity.Cosecha;
import ar.com.SgCampo.Model.Entity.Producto;
import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Serivice.IArrendatarioService;
import ar.com.SgCampo.Model.Serivice.ICosechaService;
import ar.com.SgCampo.Model.Serivice.IProductoService;
import ar.com.SgCampo.Model.Serivice.ISociosService;

@Controller
public class CosechaController {

	@Autowired
	IArrendatarioService dat;
	@Autowired
	ISociosService socio;
	@Autowired
	IProductoService prod;
	@Autowired
	ICosechaService cos;
	
	@GetMapping("/altaCosecha")
	public String crear(Model model) {
		//crear la lista para pasar y pueda asociar
		List <Socio> listaSocio = socio.listar();
		
		List <Producto> listaProducto = prod.listar();
		
		model.addAttribute("listaSocios",listaSocio);
		model.addAttribute("listaProductos",listaProducto);
		
		Cosecha NuevaCosecha=new Cosecha();
		
		model.addAttribute("cosecha", NuevaCosecha);
		return "Cosecha/altaCosecha";
	}

	/*
	 * @GetMapping("/obtenerArrendatarios/{socioId}")
	 * 
	 * @ResponseBody // public List<Arrendatario> obtenerArrendatarios(@PathVariable
	 * Long socioId) { return dat.listarPorSocio(socioId); }
	 */
	@GetMapping("/obtenerArrendatarios/{socioId}")
	@ResponseBody
	public List<ArrendatarioDTO> obtenerArrendatarios(@PathVariable Long socioId) {
	    List<Arrendatario> arrendatarios = dat.listarPorSocio(socioId);
	    List<ArrendatarioDTO> arrendatariosDTO = new ArrayList<>();

	    for (Arrendatario arrendatario : arrendatarios) {
	        ArrendatarioDTO dto = new ArrendatarioDTO(
	            arrendatario.getId(),
	            arrendatario.getNombre() + " " + arrendatario.getApellido()
	        );
	        arrendatariosDTO.add(dto);
	    }

	    return arrendatariosDTO;
	}

	@PostMapping("/guardarCosecha")
	public String guardarCosecha(Cosecha cosecha, @RequestParam("arriendatario.id") Long arrendatarioId) {
	    System.out.println(cosecha);
		
		// Recupera el objeto completo de Arrendatario usando el ID
	    Arrendatario arrendatario = dat.Idlistar(arrendatarioId)
	        .orElseThrow(() -> new IllegalArgumentException("Arrendatario no encontrado"));

	    // Asocia el Arrendatario con la Cosecha
	    cosecha.setArriendatario(arrendatario);

	    // Guarda la cosecha
	    cos.save(cosecha);

	    // Redirige a la lista de cosechas
	    return "Cosecha/ListaCosecha";
	}



}
