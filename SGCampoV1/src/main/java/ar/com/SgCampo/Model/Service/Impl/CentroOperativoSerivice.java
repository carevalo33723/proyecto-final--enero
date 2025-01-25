package ar.com.SgCampo.Model.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Repository.ICentroOperativo;
import ar.com.SgCampo.Model.Serivice.ICentroOperativoService;

@Service
public class CentroOperativoSerivice implements ICentroOperativoService{
	
	@Autowired
	ICentroOperativo dato;

	@Override
	public List<Centro_Operativo> listar() {
		List<Centro_Operativo> valor= (List<Centro_Operativo>) dato.findAll();
		return valor;
	}

	@Override
	public Optional<Centro_Operativo> Idlistar(int id) {
		
		return dato.findById((long) id);
	}

	@Override
	public int save(Centro_Operativo p) {
		 int res=0;
		 Centro_Operativo centro = dato.save(p);
		 
		 if (!centro.equals(null)) {
			 
			 res=1;
		 }
		 return res;
	}

	@Override
	public void eliminar(int id) {
		
		
	}

	@Override
	public Centro_Operativo findByNombre(String nombre) {
		
		return dato.findByNombre(nombre);
	}

	@Override
	public Centro_Operativo findById(int id) {
		
		return dato.findById(id);
	}

	

	

}
