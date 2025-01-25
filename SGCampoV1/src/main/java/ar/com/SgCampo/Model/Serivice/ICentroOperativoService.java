package ar.com.SgCampo.Model.Serivice;

import java.util.List;
import java.util.Optional;

import ar.com.SgCampo.Model.Entity.Centro_Operativo;

public interface ICentroOperativoService {
	
	 List<Centro_Operativo> listar();
	 Optional<Centro_Operativo> Idlistar(int id);
	 int save (Centro_Operativo p);
	 void eliminar(int id);
	 Centro_Operativo findByNombre(String nombre);
	 Centro_Operativo findById(int id);

}
