package com.tp.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Marque {
	@Id
	private Long idMarq;
	private String libelleMarq;
	
	
	public Long getIdMarq() {
		return idMarq;
	}

	public void setIdMarq(Long idMarq) {
		this.idMarq = idMarq;
	}

	public String getLibelleMarq() {
		return libelleMarq;
	}

	public void setLibelleMarq(String libelleMarq) {
		this.libelleMarq = libelleMarq;
	}

	public Marque(Long idMarq, String libelleMarq) {
		super();
		this.idMarq = idMarq;
		this.libelleMarq = libelleMarq;
	}

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Marque [idMarq=" + idMarq + ", libelleMarq=" + libelleMarq + "]";
	}
	
}