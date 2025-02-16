package ar.com.SgCampo.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DetalleEmbalado {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "embalado_id")
    private Embalado embalado;

    @ManyToOne
    @JoinColumn(name = "detalle_cosecha_id")
    private DetalleCosecha detalleCosecha;

    private int cantidadCosechada;
    private int cantidadEmbalada;
    private int cajonesUtilizados;
	public DetalleEmbalado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DetalleEmbalado(Long id, Embalado embalado, DetalleCosecha detalleCosecha, int cantidadCosechada,
			int cantidadEmbalada, int cajonesUtilizados) {
		super();
		this.id = id;
		this.embalado = embalado;
		this.detalleCosecha = detalleCosecha;
		this.cantidadCosechada = cantidadCosechada;
		this.cantidadEmbalada = cantidadEmbalada;
		this.cajonesUtilizados = cajonesUtilizados;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Embalado getEmbalado() {
		return embalado;
	}
	public void setEmbalado(Embalado embalado) {
		this.embalado = embalado;
	}
	public DetalleCosecha getDetalleCosecha() {
		return detalleCosecha;
	}
	public void setDetalleCosecha(DetalleCosecha detalleCosecha) {
		this.detalleCosecha = detalleCosecha;
	}
	public int getCantidadCosechada() {
		return cantidadCosechada;
	}
	public void setCantidadCosechada(int cantidadCosechada) {
		this.cantidadCosechada = cantidadCosechada;
	}
	public int getCantidadEmbalada() {
		return cantidadEmbalada;
	}
	public void setCantidadEmbalada(int cantidadEmbalada) {
		this.cantidadEmbalada = cantidadEmbalada;
	}
	public int getCajonesUtilizados() {
		return cajonesUtilizados;
	}
	public void setCajonesUtilizados(int cajonesUtilizados) {
		this.cajonesUtilizados = cajonesUtilizados;
	}
    

}
