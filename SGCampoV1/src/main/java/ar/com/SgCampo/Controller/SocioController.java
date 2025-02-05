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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ar.com.SgCampo.Model.Entity.Lote;
import ar.com.SgCampo.Model.Entity.Socio;

import ar.com.SgCampo.Model.Serivice.ILoteService;
import ar.com.SgCampo.Model.Serivice.ISociosService;

@Controller
public class SocioController {
	
	@Autowired
	ISociosService dato;
	@Autowired
	ILoteService loteService;
	
	@GetMapping("/AltaSocio")
    public String crear(Model model) {        
        // Obtener la lista de lotes disponibles
        List<Lote> listaLotes = loteService.listar();
        model.addAttribute("listaLotes", listaLotes);
        
        // Crear un nuevo objeto Socio para la vista
        Socio nuevoSocio = new Socio();        
        model.addAttribute("CentroO", nuevoSocio);

        return "Socios/Alta-socios";
    }

    @PostMapping("/guardarSocio")
    public String guardar(Model model, Socio socioParaGuardar, 
                          @RequestParam("Loteid") int loteId, RedirectAttributes redirectAttributes) {  
        // Verificar si el socio ya existe por nombre
        Socio socioRepetidoNombre = dato.findByNombre(socioParaGuardar.getNombre());
        if (socioRepetidoNombre != null) {            
            return "redirect:/Socios/Lista-Socios";
        }

     //Obtener el ID del lote desde el objeto socioParaGuardar
       Lote lote = loteService.lotePorID(loteId);
       socioParaGuardar.setLote(lote);

        // Guardar el socio en la base de datos
        dato.save(socioParaGuardar); 
     // Agregar mensaje flash para el caso de éxito
        redirectAttributes.addFlashAttribute("mensajeExito", "Socio creado exitosamente.");
        return "redirect:/Socios";
    }
	
	@GetMapping("/editarSocio/{id}")
	public String editar (@PathVariable int id,Model model) {
		
		
		return null;
	}
}
