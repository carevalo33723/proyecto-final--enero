package ar.com.SgCampo.Model.Serivice;

import java.util.List;
import java.util.Optional;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;
import ar.com.SgCampo.Model.Entity.Socio;

public interface ISociosService {
	
	 List<Socio> listar();
	 Optional<Socio> Idlistar(int id);
	 int save (Socio p);
	 void eliminar(int id);
	 Socio findByNombre(String nombre);
	 Socio findById(int id);

}
