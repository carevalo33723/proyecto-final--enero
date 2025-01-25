package ar.com.SgCampo.Model.Entity;

public class ArrendatarioDTO {
	private Long id;
	private String nombreCompleto;
	public ArrendatarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrendatarioDTO(Long id, String nombreCompleto) {
		super();
		this.id = id;
		this.nombreCompleto = nombreCompleto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	

}
