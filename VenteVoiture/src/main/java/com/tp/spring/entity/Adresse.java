package com.tp.spring.entity;



import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Adresse{
	
	@Id
	private Long id;
	private int numero;
	private String libelle;
	private String ville;
	private String pays;
	
	//Getter and Setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	//Constructeur par défaut
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructeur paramétré
	public Adresse(Long id, int numero, String libelle, String ville, String pays) {
		super();
		this.id = id;
		this.numero = numero;
		this.libelle = libelle;
		this.ville = ville;
		this.pays = pays;
	}
	
	//Méthode renvoie une chaîne de caractères servant à décrire l'objet concerné
	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numero=" + numero + ", libelle=" + libelle + ", ville=" + ville + ", pays="
				+ pays + "]";
	}
	 
	

}

