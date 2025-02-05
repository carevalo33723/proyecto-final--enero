package ar.com.SgCampo.Model.Entity;

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
public class DetalleCosecha {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cosecha_id", nullable = false)
    private Cosecha cosecha;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;
    
    @ManyToOne
    @JoinColumn(name = "arriendatario_id")
    private Arrendatario arrendatario;

    private int cantidad;
    
    @OneToMany(mappedBy = "detalleCosecha", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleEmbalado> detallesEmbalado = new ArrayList<>();

	public DetalleCosecha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleCosecha(Long id, Cosecha cosecha, Producto producto, Arrendatario arrendatario, int cantidad,
			List<DetalleEmbalado> detallesEmbalado) {
		super();
		this.id = id;
		this.cosecha = cosecha;
		this.producto = producto;
		this.arrendatario = arrendatario;
		this.cantidad = cantidad;
		this.detallesEmbalado = detallesEmbalado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cosecha getCosecha() {
		return cosecha;
	}

	public void setCosecha(Cosecha cosecha) {
		this.cosecha = cosecha;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Arrendatario getArrendatario() {
		return arrendatario;
	}

	public void setArrendatario(Arrendatario arrendatario) {
		this.arrendatario = arrendatario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public List<DetalleEmbalado> getDetallesEmbalado() {
		return detallesEmbalado;
	}

	public void setDetallesEmbalado(List<DetalleEmbalado> detallesEmbalado) {
		this.detallesEmbalado = detallesEmbalado;
	}

	

	
    
    
}
