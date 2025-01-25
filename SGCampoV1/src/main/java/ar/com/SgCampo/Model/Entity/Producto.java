package ar.com.SgCampo.Model.Entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Producto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreProducto;
    private String detalle;
    
    
    @OneToMany(mappedBy = "producto")
    private List<Cosecha> cosechas;
    
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	


	public Producto(Long id, String nombreProducto, String detalle, List<Cosecha> cosechas) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.detalle = detalle;
		this.cosechas = cosechas;
	}




	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public List<Cosecha> getCosechas() {
		return cosechas;
	}


	public void setCosechas(List<Cosecha> cosechas) {
		this.cosechas = cosechas;
	}
    
    
}
