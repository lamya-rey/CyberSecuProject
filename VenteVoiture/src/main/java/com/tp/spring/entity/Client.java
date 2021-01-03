package com.tp.spring.entity;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Client {
	@Id
	private Long id;
	private String prenom;
	private String nom;
	private String phone;
	private String mail;
	private String login;
	private String password;
	private String role;
	
    //Getter and Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	//Constructeur par défaut
	public Client() {
		super();
	}
	
    //Constructeur paramétré
	public Client(Long id, String prenom, String nom, String phone, String mail, String login, String password,
			String role) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.phone = phone;
		this.mail = mail;
		this.login = login;
		this.password = password;
		this.role = role;
	}

	
	 //méthode renvoie une chaîne de caractères servant à décrire l'objet concerné
	@Override
	public String toString() {
		return "Client [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", phone=" + phone + ", mail=" + mail
				+ ", login=" + login + ", password=" + password + ", role=" + role + "]";
	}

	

	
	

}
