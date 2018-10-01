package br.com.mapas.models;

public class Rota {
	
	private Long id;
	private String descricao;
	private String geometria;
	
	public Rota() {
		super();
	}
	public Rota(Long id, String descricao, String geometria) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.geometria = geometria;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGeometria() {
		return geometria;
	}
	public void setGeometria(String geometria) {
		this.geometria = geometria;
	}
	@Override
	public String toString() {
		return "Rota [id=" + id + ", descricao=" + descricao + ", geometria=" + geometria + "]";
	}
}
