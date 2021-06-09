package com.example.demo.universite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import java.util.Collection;

@Entity
public class Universite implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeUni;
	private String nomUni;
	private String adresseSite;
	@OneToMany(mappedBy = "Universite")
	private Collection<Departement> Departement;

	public Long getCodeUni() {
		return codeUni;
	}

	public void setCodeUni(Long codeUni) {
		this.codeUni = codeUni;
	}

	public String getNomUni() {
		return nomUni;
	}

	public void setNomUni(String nomUni) {
		this.nomUni = nomUni;
	}

	public String getAdresseSite() {
		return adresseSite;
	}

	public void setAdresseSite(String adresseSite) {
		this.adresseSite = adresseSite;
	}

	public Collection<Departement> getDepartement() {
		return Departement;
	}

	public void setDepartement(Collection<Departement> departement) {
		Departement = departement;
	}

}