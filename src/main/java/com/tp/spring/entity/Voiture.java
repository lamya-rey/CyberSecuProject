package com.tp.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Voiture {
	@Id
	private Long id ;
	private Double prix;
	private Double kilometrage;
	private String couleur;	
	@ManyToOne
	private Marque marque;	
	@ManyToOne
	private Client client;
	
	//Getter and Setter
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(Double kilometrage) {
		this.kilometrage = kilometrage;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	// Méthode renvoie une chaîne de caractères servant à décrire l'objet concerné
	@Override
	public String toString() {
		return "Voiture [id=" + id + ", prix=" + prix + ", kilometrage=" + kilometrage
				+ ", couleur=" + couleur + ", marque=" + marque + ", client=" + client + "]";
	}
	 
	//Constructeur paramétré 
	public Voiture(Long id, Double prix, Double kilometrage, String couleur, Marque marque,
			Client client) {
		super();
		this.id = id;
		this.prix = prix;
		this.kilometrage = kilometrage;
		this.couleur = couleur;
		this.marque = marque;
		this.client = client;
	}
	
	//Constructeur par défaut
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	


}