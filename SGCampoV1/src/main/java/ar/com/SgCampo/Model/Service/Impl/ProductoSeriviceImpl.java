package ar.com.SgCampo.Model.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Entity.Producto;

import ar.com.SgCampo.Model.Repository.IProducto;
import ar.com.SgCampo.Model.Serivice.IProductoService;

@Service
public class ProductoSeriviceImpl implements IProductoService{

	
	@Autowired
	IProducto pr;
	@Override
	public List<Producto> listar() {
		
		return (List<Producto>) pr.findAll();
	}

	@Override
	public Optional<Producto> Idlistar(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Producto p) {
		int res=0;
		 Producto produc = pr.save(p);
		 
		 if (!produc.equals(null)) {
			 
			 res=1;
		 }
		 return res;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public Producto findByNombreProducto(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
