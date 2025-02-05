package ar.com.SgCampo.Model.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.SgCampo.Model.Entity.Embalado;
import ar.com.SgCampo.Model.Entity.Socio;

@Repository
public interface IEmbalado extends CrudRepository<Embalado, Long>{
	
	
	Optional<Embalado> findById(Long id);
	Embalado findById (int id);

}
