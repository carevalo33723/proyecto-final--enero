package ar.com.SgCampo.Model.Entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cosecha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private LocalDateTime fecha;

	private String nota;

	// Una cosecha puede tener múltiples detalles de cosecha
	@OneToMany(mappedBy = "cosecha", cascade = CascadeType.ALL)
	private List<DetalleCosecha> detallesCosecha;

	public Cosecha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cosecha(Long id, LocalDateTime fecha, String nota, List<DetalleCosecha> detallesCosecha) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.nota = nota;
		this.detallesCosecha = detallesCosecha;
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

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public List<DetalleCosecha> getDetallesCosecha() {
		return detallesCosecha;
	}

	public void setDetallesCosecha(List<DetalleCosecha> detallesCosecha) {
		this.detallesCosecha = detallesCosecha;
	}
	public void agregarDetalle(DetalleCosecha detalle) {
	    if (this.detallesCosecha == null) {
	        this.detallesCosecha = new ArrayList<>();
	    }
	    this.detallesCosecha.add(detalle);
	    detalle.setCosecha(this); // Asociamos el detalle con la cosecha
	}


}
