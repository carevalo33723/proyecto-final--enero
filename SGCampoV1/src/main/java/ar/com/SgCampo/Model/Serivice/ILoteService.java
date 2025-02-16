package ar.com.SgCampo.Model.Serivice;

import java.util.List;
import java.util.Optional;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Entity.Lote;

public interface ILoteService {
	List<Lote> listar();
	 Optional<Lote> Idlistar(int id);
	 int save (Lote p);
	 void eliminar(int id);
	 Lote findByNombre(String nombre);
	 Optional<Lote> findById(Long id);
	 Lote lotePorID (int id);
	
}
