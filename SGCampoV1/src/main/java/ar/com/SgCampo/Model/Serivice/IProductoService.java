package ar.com.SgCampo.Model.Serivice;

import java.util.List;
import java.util.Optional;


import ar.com.SgCampo.Model.Entity.Producto;

public interface IProductoService {

	
	List<Producto> listar();
	 Optional<Producto> Idlistar(int id);
	 int save (Producto p);
	 void eliminar(int id);
	 Producto findByNombreProducto(String nombre);
}
