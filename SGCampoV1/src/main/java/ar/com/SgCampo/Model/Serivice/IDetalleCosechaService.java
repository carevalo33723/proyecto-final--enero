package ar.com.SgCampo.Model.Serivice;

import java.util.List;
import java.util.Optional;

import ar.com.SgCampo.Model.Entity.Cosecha;
import ar.com.SgCampo.Model.Entity.DetalleCosecha;

public interface IDetalleCosechaService {
	List<DetalleCosecha> listar();
	 Optional<DetalleCosecha> Idlistar(int id);
	DetalleCosecha save (DetalleCosecha p);
	 void eliminar(int id);
	 List<DetalleCosecha> obtenerPorCosecha(int cosechaId);
	 
	 DetalleCosecha buscarPorID (int id);
	 
}
