package ar.com.SgCampo.Model.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.SgCampo.Model.Entity.Lote;
import ar.com.SgCampo.Model.Entity.Socio;
import ar.com.SgCampo.Model.Repository.ILote;
import ar.com.SgCampo.Model.Serivice.ILoteService;

@Service
public class LoteServiceImple implements ILoteService{
	@Autowired
	ILote dato;
	
	@Override
	public List<Lote> listar() {
		List<Lote> valor= (List<Lote>) dato.findAll();
		return valor;
	}

	@Override
	public Optional<Lote> Idlistar(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Lote p) {
		int res=0;
		 Lote lote = dato.save(p);
		 
		 if (!lote.equals(null)) {
			 
			 res=1;
		 }
		 return res;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lote findByNombre(String nombre) {
		
		return dato.findByNombre(nombre);
	}

	@Override
	public Optional<Lote> findById(Long id) {
		// TODO Auto-generated method stub
		return dato.findById(id);
	}

	@Override
	public Lote lotePorID(int id) {
		
		return dato.findById(id);
	}

	

	

}
