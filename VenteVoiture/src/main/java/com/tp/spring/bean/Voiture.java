package com.tp.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Voiture {
	@Id
	private Long idVoit ;
	private Double prix;
	private Double kilometrage;
	private String couleur;	
	@ManyToOne
	private Marque marque;	
	@ManyToOne
	private Client client;
	
	public Long getIdVoit() {
		return idVoit;
	}
	public void setIdVoit(Long idVoit) {
		this.idVoit = idVoit;
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
	
	@Override
	public String toString() {
		return "Voiture [idVoit=" + idVoit + ", prix=" + prix + ", kilometrage=" + kilometrage
				+ ", couleur=" + couleur + ", marque=" + marque + ", client=" + client + "]";
	}
	public Voiture(Long id, Long idVoit, Double prix, Double kilometrage, String couleur, Marque marque,
			Client client) {
		super();
		this.idVoit = idVoit;
		this.prix = prix;
		this.kilometrage = kilometrage;
		this.couleur = couleur;
		this.marque = marque;
		this.client = client;
	}
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	


}