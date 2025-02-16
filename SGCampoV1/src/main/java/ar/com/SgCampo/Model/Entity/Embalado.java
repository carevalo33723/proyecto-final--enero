package ar.com.SgCampo.Model.Entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Embalado {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private LocalDate fecha;

	    private String nota;

	    @OneToMany(mappedBy = "embalado", cascade = CascadeType.ALL)
	    private List<DetalleEmbalado> detalles;

		public Embalado() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Embalado(Long id, LocalDate fecha, String nota, List<DetalleEmbalado> detalles) {
			super();
			this.id = id;
			this.fecha = fecha;
			this.nota = nota;
			this.detalles = detalles;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public String getNota() {
			return nota;
		}

		public void setNota(String nota) {
			this.nota = nota;
		}

		public List<DetalleEmbalado> getDetalles() {
			return detalles;
		}

		public void setDetalles(List<DetalleEmbalado> detalles) {
			this.detalles = detalles;
		}

		
	    

}
