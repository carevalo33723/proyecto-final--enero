package ar.com.SgCampo.Model.Repository;

import org.springframework.data.repository.CrudRepository;

import ar.com.SgCampo.Model.Entity.Lote;


public interface ILote extends CrudRepository<Lote, Long>{
	
	Lote findByNombre(String nombre);
	Lote findById(int id);
	

}
