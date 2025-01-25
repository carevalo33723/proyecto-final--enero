package ar.com.SgCampo.Model.Entity;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity
public class Cosecha {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private LocalDateTime fecha;

    private int cantidadCosechada;
    private String nota;
   
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "arriendatario_id")
    private Arrendatario arriendatario;
	

	public Cosecha() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cosecha(Long id, LocalDateTime fecha, int cantidadCosechada, String nota, Producto producto,
			Arrendatario arriendatario) {
		super();
		this.id = id;
		this.fecha = LocalDateTime.now();
		this.cantidadCosechada = cantidadCosechada;
		this.nota = nota;
		this.producto = producto;
		this.arriendatario = arriendatario;
	}


	public Arrendatario getArriendatario() {
		return arriendatario;
	}


	public void setArriendatario(Arrendatario arriendatario) {
		this.arriendatario = arriendatario;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public int getCantidadCosechada() {
		return cantidadCosechada;
	}

	public void setCantidadCosechada(int cantidadCosechada) {
		this.cantidadCosechada = cantidadCosechada;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
	    return "Cosecha{" +
	            "id=" + id +
	            ", cantidadCosechada=" + cantidadCosechada +
	            ", fecha=" + fecha +
	            ", nota='" + nota + '\'' +
	            ", arriendatario=" + (arriendatario != null ? arriendatario.getId() : null) +
	            ", producto=" + (producto != null ? producto.getId() : null) +
	            '}';
	}
}
