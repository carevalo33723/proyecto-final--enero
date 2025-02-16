package ar.com.SgCampo.Model.Service.Impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.SgCampo.Model.Entity.DetalleCosecha;
import ar.com.SgCampo.Model.Entity.DetalleEmbalado;
import ar.com.SgCampo.Model.Entity.Embalado;
import ar.com.SgCampo.Model.Repository.IDetalleCosecha;
import ar.com.SgCampo.Model.Repository.IEmbalado;
import ar.com.SgCampo.Model.Serivice.IDetalleCosechaService;

@Service
public class DetalleCosechaImple implements IDetalleCosechaService{
	@Autowired
	IDetalleCosecha cose;
	
	@Autowired
	IEmbalado emba;
	
	
	
	@Override
	public List<DetalleCosecha> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DetalleCosecha> Idlistar(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public DetalleCosecha save(DetalleCosecha p) {
		
		return cose.save(p);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DetalleCosecha> obtenerPorCosecha(int cosechaId) {
		
		return cose.findByCosechaId(cosechaId);
	}

	@Override
	public DetalleCosecha buscarPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	}

	

