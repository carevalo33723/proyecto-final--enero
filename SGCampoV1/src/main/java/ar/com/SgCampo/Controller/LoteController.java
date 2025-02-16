package ar.com.SgCampo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Entity.Lote;
import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Serivice.ICentroOperativoService;
import ar.com.SgCampo.Model.Serivice.ILoteService;

@Controller
public class LoteController {

	
	@Autowired
	ICentroOperativoService centro;
	
	@Autowired
	ILoteService loteser;
	
	@GetMapping("/AltaLote")
    public String crear(Model model) {        
        // Obtener la lista de centros operativos
        List<Centro_Operativo> listaCentros = centro.listar();
        model.addAttribute("listaCentro", listaCentros);
        
        // Crear un nuevo objeto Socio para la vista
        Lote nuevoLote = new Lote();
        model.addAttribute("LoteNuevo", nuevoLote);

        return "lote/alta-lote";
    }
	
	@PostMapping("/guardarLote")
    public String guardar(Model model, Lote loteParaGuardar, 
                          @RequestParam("Loteid") int loteId) {  
        // Verificar si el lote ya existe por nombre
        Lote loteRepetidoNombre = loteser.findByNombre(loteParaGuardar.getNombre());
        		
        if (loteRepetidoNombre != null) {            
            return "redirect:/lista_lotes";
        }

     //Obtener el ID del lote desde el objeto socioParaGuardar
       Centro_Operativo centroNuevo = centro.findById(loteId);
       loteParaGuardar.setCentroOperativo(centroNuevo);

        // Guardar el socio en la base de datos
        loteser.save(loteParaGuardar);
     
       
        return "redirect:/lista_lotes";
    }
}
