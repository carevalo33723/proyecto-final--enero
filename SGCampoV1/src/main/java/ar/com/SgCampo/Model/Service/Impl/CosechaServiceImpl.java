package ar.com.SgCampo.Model.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ar.com.SgCampo.Model.Entity.Cosecha;

import ar.com.SgCampo.Model.Repository.ICosecha;
import ar.com.SgCampo.Model.Serivice.ICosechaService;

@Service
public class CosechaServiceImpl implements ICosechaService{

	@Autowired
	ICosecha dat;
	@Override
	public List<Cosecha> listar() {
		return (List<Cosecha>) dat.findAll();
	}

	@Override
	public Optional<Cosecha> Idlistar(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Cosecha save(Cosecha p) {
		return dat.save(p);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

}
