package ar.com.SgCampo.Model.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.SgCampo.Model.Entity.Arrendatario;


@Repository
public interface IArrendatario extends CrudRepository<Arrendatario, Long>{
	
	Arrendatario findByNombre(String nombre);
	Arrendatario findById(int id);
	 List<Arrendatario> findBySocioId(Long socioId);
	
	

}
