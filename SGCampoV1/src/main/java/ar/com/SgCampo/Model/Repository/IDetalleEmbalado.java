package ar.com.SgCampo.Model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.SgCampo.Model.Entity.DetalleCosecha;
import ar.com.SgCampo.Model.Entity.DetalleEmbalado;

@Repository
public interface IDetalleEmbalado extends CrudRepository<DetalleEmbalado, Long>{
	
	

}
