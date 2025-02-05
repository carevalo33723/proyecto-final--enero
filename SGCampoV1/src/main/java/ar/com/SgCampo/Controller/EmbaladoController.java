package ar.com.SgCampo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.SgCampo.Model.Entity.Cosecha;
import ar.com.SgCampo.Model.Entity.DetalleCosecha;
import ar.com.SgCampo.Model.Serivice.ICosechaService;
import ar.com.SgCampo.Model.Serivice.IDetalleCosechaService;
import ar.com.SgCampo.Model.Serivice.IDetalleEmbaladoService;
import ar.com.SgCampo.Model.Serivice.IEmbaladoService;

@Controller
public class EmbaladoController {
	
	@Autowired
	ICosechaService cos;
	@Autowired
	IDetalleCosechaService det;
	
	@Autowired
	IEmbaladoService emb;
	
	@Autowired
	IDetalleEmbaladoService detEmb;
	
	@GetMapping("/nuevo")
    public String nuevoEmbalado(@RequestParam("cosechaId") int cosechaId, Model model) {
       
		Cosecha cosecha= cos.CosechaPorID(cosechaId);
		model.addAttribute("cosecha", cosecha);
		
		List<DetalleCosecha> ListCosecha=det.obtenerPorCosecha(cosechaId);
		
        model.addAttribute("detallesCosecha",ListCosecha );
        return "Enbalaje/Alta-Embalado1";
    }
	 @PostMapping("/guardarEmbalajes")
	    public String guardarEmbalado(
	            	            
	            @RequestParam("nota") String nota,
	            @RequestParam("seleccionados") List<Integer> detalleIds,
	            @RequestParam("cantidadEmbalada") List<Integer> cantidades)
	             {

		 detEmb.guardarConDetalles(nota, detalleIds, cantidades);
	        return "redirect:/";
	    }

}
