package ar.com.SgCampo.Model.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Repository.ISocios;
import ar.com.SgCampo.Model.Serivice.ISociosService;


@Service
public class SocioService implements ISociosService{
	
	@Autowired
	ISocios dato;

	@Override
	public List<Socio> listar() {
		
		return (List<Socio>) dato.findAll();
	}

	@Override
	public Optional<Socio> Idlistar(int id) {
		// TODO Auto-generated method stub
		return dato.findById((long) id);
	}

	@Override
	public int save(Socio p) {
		int res=0;
		 Socio socio = dato.save(p);
		 
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
	public Socio findByNombre(String nombre) {
		
		return dato.findByNombre(nombre);
	}

	@Override
	public Socio findById(int id) {
		// TODO Auto-generated method stub
		return dato.findById(id);
	}

}
