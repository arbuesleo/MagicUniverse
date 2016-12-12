package com.leonardo.gomes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.leonardo.gomes.pojo.CartaPojo;

@Entity
public class CartaEntity {
	@Id
	@GeneratedValue
	private Integer id;
	String nome;
	String mana;
	String urlImagem;
	String poderAtaque;
	String poderDefesa;
	public CartaEntity(CartaPojo cartaPojo) {
		super();
		this.nome = cartaPojo.getName();		
		this.mana = cartaPojo.getManaCost();
		this.urlImagem = cartaPojo.getImageUrl();
		this.poderAtaque = cartaPojo.getPower();
		this.poderDefesa = cartaPojo.getToughness();
	}
	public CartaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String[] getMana() {
		mana = mana.replace("{", "");
		String[] manas = mana.split("}");
		return manas;
	}
	public void setMana(String mana) {
		this.mana = mana;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getPoderAtaque() {
		if(poderAtaque == null)
			return "*";
		return poderAtaque;
	}
	public void setPoderAtaque(String poderAtaque) {
		this.poderAtaque = poderAtaque;
	}
	public String getPoderDefesa() {
		if(poderDefesa == null)
			return "*";
		return poderDefesa;
	}
	public void setPoderDefesa(String poderDefesa) {
		this.poderDefesa = poderDefesa;
	}	
}
