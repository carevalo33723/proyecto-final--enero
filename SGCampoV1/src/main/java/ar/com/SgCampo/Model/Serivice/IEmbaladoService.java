package ar.com.SgCampo.Model.Serivice;

import java.util.List;
import java.util.Optional;

import ar.com.SgCampo.Model.Entity.Embalado;


public interface IEmbaladoService {

	List<Embalado> listar();
	 Optional<Embalado> Idlistar(int id);
	 int save (Embalado p);
	 void eliminar(int id);
	
	 Embalado EmbaladoPorID (int id);
	
}
