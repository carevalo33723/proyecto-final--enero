package ar.com.SgCampo.Model.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.SgCampo.Model.Entity.Arrendatario;

import ar.com.SgCampo.Model.Repository.IArrendatario;
import ar.com.SgCampo.Model.Serivice.IArrendatarioService;

@Service
public class ArrendatarioService implements IArrendatarioService{
	
	@Autowired
	IArrendatario dato;

	@Override
	public List<Arrendatario> listar() {
		
		return (List<Arrendatario>) dato.findAll();
	}

	@Override
	public Optional<Arrendatario> Idlistar(Long id) {
	
		return dato.findById(id);
	}

	@Override
	public int save(Arrendatario p) {
		int res=0;
		 Arrendatario arre = dato.save(p);
		 
		 if (!arre.equals(null)) {
			 
			 res=1;
		 }
		 return res;
	}

	@Override
	public void eliminar(int id) {
		
		
	}

	@Override
	public Arrendatario findByNombre(String nombre) {
		
		return dato.findByNombre(nombre);
	}

	@Override
	public List<Arrendatario> listarPorSocio(Long socioId) {
		
		return dato.findBySocioId(socioId);
	}

}
