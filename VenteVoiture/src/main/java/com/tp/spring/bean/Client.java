package com.tp.spring.bean;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Client {
	@Id
	private Long idCl;
	private String PrenomCl;
	private String nomCl;
	private String phoneCl;
	private String mailCl;
	

	public Long getIdCl() {
		return idCl;
	}

	public void setIdCl(Long idCl) {
		this.idCl = idCl;
	}

	public String getPrenomCl() {
		return PrenomCl;
	}

	public void setPrenomCl(String PrenomCl) {
		this.PrenomCl = PrenomCl;
	}

	public String getNomCl() {
		return nomCl;
	}

	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}

	public String getPhoneCl() {
		return phoneCl;
	}

	public void setPhoneCl(String phoneCl) {
		this.phoneCl = phoneCl;
	}

	public String getMailCl() {
		return mailCl;
	}

	public void setMailCl(String mailCl) {
		this.mailCl = mailCl;
	}


	public Client() {
		super();
	}

	public Client(Long idCl, String prenomCl, String nomCl, String phoneCl, String mailCl) {
		super();
		this.idCl = idCl;
		PrenomCl = prenomCl;
		this.nomCl = nomCl;
		this.phoneCl = phoneCl;
		this.mailCl = mailCl;
	}

	@Override
	public String toString() {
		return "Client [idCl=" + idCl + ", PrenomCl=" + PrenomCl + ", nomCl=" + nomCl + ", phoneCl=" + phoneCl
				+ ", mailCl=" + mailCl + "]";
	}
	

}
