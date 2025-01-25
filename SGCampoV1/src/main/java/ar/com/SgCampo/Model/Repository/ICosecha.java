package ar.com.SgCampo.Model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import ar.com.SgCampo.Model.Entity.Cosecha;

@Repository
public interface ICosecha extends CrudRepository<Cosecha, Long>{
	
	/* Cosecha findByNombre(String nombre); */
	Cosecha findById(int id);
	
	
	

}
