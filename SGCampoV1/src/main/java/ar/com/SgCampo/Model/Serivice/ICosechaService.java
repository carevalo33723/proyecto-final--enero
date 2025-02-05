package ar.com.SgCampo.Model.Serivice;

import java.util.List;
import java.util.Optional;


import ar.com.SgCampo.Model.Entity.Cosecha;
import ar.com.SgCampo.Model.Entity.Embalado;

public interface ICosechaService {
	List<Cosecha> listar();
	 Optional<Cosecha> Idlistar(int id);
	Cosecha save (Cosecha p);
	 void eliminar(int id);
		/* Arrendatario findByNombre(String nombre); */
	 
	 Cosecha CosechaPorID(int id);
	
	
}
