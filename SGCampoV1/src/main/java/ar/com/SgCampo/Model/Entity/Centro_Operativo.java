package ar.com.SgCampo.Model.Entity;



import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Centro_Operativo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String detalle;
    
    
   
 // Un centro operativo puede tener múltiples lotes
    @OneToMany(mappedBy = "centroOperativo")
    private List<Lote> lotes;



	public Centro_Operativo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Centro_Operativo(Long id, String nombre, String detalle, List<Lote> lotes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.detalle = detalle;
		this.lotes = lotes;
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



	public String getDetalle() {
		return detalle;
	}



	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}



	public List<Lote> getLotes() {
		return lotes;
	}



	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}
    
    

}
