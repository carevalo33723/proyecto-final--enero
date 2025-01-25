package ar.com.SgCampo.Model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import java.util.List;
import java.util.Optional;


@Repository
public interface ICentroOperativo extends CrudRepository<Centro_Operativo, Long>{
	
	Centro_Operativo findByNombre(String nombre);
	Centro_Operativo findById(int id);
}
