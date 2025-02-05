package ar.com.SgCampo.Model.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.SgCampo.Model.Entity.DetalleCosecha;
import ar.com.SgCampo.Model.Entity.DetalleEmbalado;

@Repository
public interface IDetalleCosecha extends JpaRepository<DetalleCosecha, Long>{
	
	DetalleCosecha findById(int id);
	List<DetalleCosecha> findByCosechaId(int cosechaId);
}
