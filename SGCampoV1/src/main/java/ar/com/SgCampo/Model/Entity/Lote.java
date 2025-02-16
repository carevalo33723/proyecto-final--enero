package ar.com.SgCampo.Model.Entity;

import java.util.List;

import ar.com.SgCampo.Controller.CentroOperativo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String tipoTrabajo;
    
    // Relación con el centro operativo (muchos a uno)
    @ManyToOne
    @JoinColumn(name = "centro_operativo_id")
    private Centro_Operativo centroOperativo;
    
    // Un lote puede tener múltiples socios
    @OneToMany(mappedBy = "lote")
    private List<Socio> socios;

	public Lote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lote(Long id, String nombre, String tipoTrabajo, Centro_Operativo centroOperativo, List<Socio> socios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipoTrabajo = tipoTrabajo;
		this.centroOperativo = centroOperativo;
		this.socios = socios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(String tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	public Centro_Operativo getCentroOperativo() {
		return centroOperativo;
	}

	public void setCentroOperativo(Centro_Operativo centroOperativo) {
		this.centroOperativo = centroOperativo;
	}

	public List<Socio> getSocios() {
		return socios;
	}

	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}

	
  
	

}
