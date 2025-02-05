package ar.com.SgCampo.Model.Serivice;



import java.util.List;

import ar.com.SgCampo.Model.Entity.DetalleCosecha;

public interface IDetalleEmbaladoService {
	
	void guardarConDetalles(String nota, List<Integer> detalleIds, List<Integer> cantidades);

}
