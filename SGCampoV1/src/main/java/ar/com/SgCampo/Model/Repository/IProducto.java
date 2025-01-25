package ar.com.SgCampo.Model.Repository;

import org.springframework.data.repository.CrudRepository;


import ar.com.SgCampo.Model.Entity.Producto;

public interface IProducto extends CrudRepository<Producto, Long>{
	
	 Producto findByNombreProducto(String nombre);
	 Producto findById(int id);

}
