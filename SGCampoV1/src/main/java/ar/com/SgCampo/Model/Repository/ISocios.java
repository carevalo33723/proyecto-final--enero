package ar.com.SgCampo.Model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Entity.Socio;


@Repository
public interface ISocios extends CrudRepository<Socio, Long>{
	Socio findByNombre(String nombre);
	Socio findById(int id);
}
