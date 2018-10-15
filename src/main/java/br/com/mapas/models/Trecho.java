package br.com.mapas.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;


@Entity
public class Trecho {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nome;
	@Column(name="geometria")
	private LineString lineString;
	
	public Trecho() {
		super();
	}
	public Trecho(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Trecho(Long id, String nome, String lineString) {
		super();
		this.id = id;
		this.nome = nome;
		this.setLineString(lineString);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LineString getLineString() {
		return lineString;
	}
	public void setLineString(String lineString) {
		try {
			this.lineString = (LineString)new WKTReader().read(lineString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.lineString.setSRID(4326);
	}
	
}
