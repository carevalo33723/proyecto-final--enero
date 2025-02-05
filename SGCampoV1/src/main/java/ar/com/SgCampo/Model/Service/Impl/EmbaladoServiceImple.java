package ar.com.SgCampo.Model.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.SgCampo.Model.Entity.Embalado;
import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Repository.IEmbalado;
import ar.com.SgCampo.Model.Serivice.IEmbaladoService;

@Service
public class EmbaladoServiceImple implements IEmbaladoService{

	@Autowired
	IEmbalado dato;
	
	@Override
	public List<Embalado> listar() {
		
		return (List<Embalado>) dato.findAll();
	}

	@Override
	public Optional<Embalado> Idlistar(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Embalado p) {
		int res=0;
		 Embalado socio = dato.save(p);
		 
		 if (!socio.equals(null)) {
			 
			 res=1;
		 }
		 return res;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Embalado EmbaladoPorID(int id) {
		
		return dato.findById(id);
	}

}
