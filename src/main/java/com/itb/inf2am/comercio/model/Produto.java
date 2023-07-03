package com.itb.inf2am.comercio.model;

public class Produto {
   
	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	private boolean codStatus;
	
	//public: Acesso liberado para todas as classes.
	
	//private: Acesso permitido apenas para os membros
	//(atributos e ou métodos) da própria classe.
	
	//Métodos Setter's e Getter's : Atribuir e recuperar dados 
	//dos atributos "RESPECTIVAMENTE"
	//Cada atributp possui o seu método set e o seu método get
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return this.id;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getCodigoBarras() {
		return this.codigoBarras;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPreco() {
		return this.preco;
	}
	public void setCodStatus(Boolean codStatus) {
		this.codStatus = codStatus;
	}
	public Boolean getCodStatus() {
		return this.codStatus;
	}
}
