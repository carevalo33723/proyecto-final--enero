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

	    @ManyToOne
	    @JoinColumn(name = "centro_operativo_id")
	    private Centro_Operativo centroOperativo;
	    
	    // En la clase Socio
	    @OneToMany(mappedBy = "socio")
	    private List<Arrendatario> arrendatarios;

		

		public Socio(Long id, String nombre, String pellido, String direccion, String telefono,
				String correoElectronico, Centro_Operativo centroOperativo, List<Arrendatario> arrendatarios) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.pellido = pellido;
			this.direccion = direccion;
			this.telefono = telefono;
			this.correoElectronico = correoElectronico;
			this.centroOperativo = centroOperativo;
			this.arrendatarios = arrendatarios;
		}

		public Socio() {
			super();
			// TODO Auto-generated constructor stub
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

		public Centro_Operativo getCentroOperativo() {
			return centroOperativo;
		}

		public void setCentroOperativo(Centro_Operativo centroOperativo) {
			this.centroOperativo = centroOperativo;
		}

		public List<Arrendatario> getArrendatarios() {
			return arrendatarios;
		}

		public void setArrendatarios(List<Arrendatario> arrendatarios) {
			this.arrendatarios = arrendatarios;
		}
		@Override
		public String toString() {
		    return nombre; 
		} 
	    

}
