package com.example.demo.universite;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.*;
import java.util.Collection;

@Entity
public class Departement implements Serializable {
	private static final long serialVersionUID = 5840371019139661234L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeDep;
	private String libelleDep;
	@ManyToOne
	@JoinColumn(name = "code_Universite")
	private Universite Universite;

	public Long getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(Long codeDep) {
		this.codeDep = codeDep;
	}

	public String getLibelleDep() {
		return libelleDep;
	}

	public void setLibelleDep(String libelleDep) {
		this.libelleDep = libelleDep;
	}

	public Universite getUniversite() {
		return Universite;
	}

	public void setUniversite(Universite universite) {
		Universite = universite;
	}

}