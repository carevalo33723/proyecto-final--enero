package ar.com.SgCampo.Model.Entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Arrendatario {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    @ManyToOne
    @JoinColumn(name = "socio_id")
    private Socio socio;
    
    @OneToMany(mappedBy = "arriendatario")
    
    private List<Cosecha> cosechas;

	public Arrendatario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Arrendatario(Long id, String nombre, String apellido, String direccion, String telefono,
			String correoElectronico, Socio socio, List<Cosecha> cosechas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.socio = socio;
		this.cosechas = cosechas;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public List<Cosecha> getCosechas() {
		return cosechas;
	}

	public void setCosechas(List<Cosecha> cosechas) {
		this.cosechas = cosechas;
	}
    
    

}
