package ar.com.SgCampo.Model.Entity;


import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Socio {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nombre;
	    private String pellido;
	    private String direccion;
	    private String telefono;
	    private String correoElectronico;

	     
	    
	 // Relación con el lote (muchos socios en un lote)
	    @ManyToOne
	    @JoinColumn(name = "lote_id")
	    private Lote lote;
	    
	    // Un socio puede tener múltiples arrendatarios
	    @OneToMany(mappedBy = "socio")
	    private List<Arrendatario> arrendatarios;

		public Socio() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Socio(Long id, String nombre, String pellido, String direccion, String telefono,
				String correoElectronico, Lote lote, List<Arrendatario> arrendatarios) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.pellido = pellido;
			this.direccion = direccion;
			this.telefono = telefono;
			this.correoElectronico = correoElectronico;
			this.lote = lote;
			this.arrendatarios = arrendatarios;
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

		public String getPellido() {
			return pellido;
		}

		public void setPellido(String pellido) {
			this.pellido = pellido;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getCorreoElectronico() {
			return correoElectronico;
		}

		public void setCorreoElectronico(String correoElectronico) {
			this.correoElectronico = correoElectronico;
		}

		public Lote getLote() {
			return lote;
		}

		public void setLote(Lote lote) {
			this.lote = lote;
		}

		public List<Arrendatario> getArrendatarios() {
			return arrendatarios;
		}

		public void setArrendatarios(List<Arrendatario> arrendatarios) {
			this.arrendatarios = arrendatarios;
		}

		
	    

}
