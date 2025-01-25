package ar.com.SgCampo.Model.Entity;



import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Centro_Operativo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String detalle;
    
    @OneToMany(mappedBy = "centroOperativo")
    private List<Socio> socios;

	public Centro_Operativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Centro_Operativo(Long id, String nombre, String detalle, List<Socio> socios) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
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

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public List<Socio> getSocios() {
		return socios;
	}

	public void setSocios(List<Socio> socios) {
		this.socios = socios;
	}
	
	@Override
	public String toString() {
	    return nombre; 
	}
 
		
		
	
 
	/*
	 * @OneToMany(mappedBy = "centroOperativo") private List<Socio> socios;
	 */


	

}
