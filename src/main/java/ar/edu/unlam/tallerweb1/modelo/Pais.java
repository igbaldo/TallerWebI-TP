package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Long habitantes;
	private String idioma;
	private String capital;
	@ManyToOne (cascade = {CascadeType.ALL})
	private Continente Contiente;
	
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
	public Long getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(Long habitantes) {
		this.habitantes = habitantes;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Continente getContiente() {
		return Contiente;
	}
	public void setContiente(Continente contiente) {
		Contiente = contiente;
	}

}
