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
    private String nombre;
    private String tipo;
    
    // Un producto puede estar en múltiples detalles de cosecha
    @OneToMany(mappedBy = "producto")
    private List<DetalleCosecha> detallesCosecha;
    
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(Long id, String nombre, String tipo, List<DetalleCosecha> detallesCosecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.detallesCosecha = detallesCosecha;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<DetalleCosecha> getDetallesCosecha() {
		return detallesCosecha;
	}

	public void setDetallesCosecha(List<DetalleCosecha> detallesCosecha) {
		this.detallesCosecha = detallesCosecha;
	}
	
	
	


	
    
    
}
