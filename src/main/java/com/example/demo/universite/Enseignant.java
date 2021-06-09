package com.example.demo.universite;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

@Entity
public class Enseignant implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Matricule;
	private String NomEns;
	private String prenomEns;
	private String AdrEns;
	private String DiplomeEns;
	@JsonIgnore
	@OneToMany(mappedBy = "enseignant")
	private List<Seance> seance;

	public Long getMatricule() {
		return Matricule;
	}

	public void setMatricule(Long matricule) {
		Matricule = matricule;
	}

	public String getNomEns() {
		return NomEns;
	}

	public void setNomEns(String nomEns) {
		NomEns = nomEns;
	}

	public String getPrenomEns() {
		return prenomEns;
	}

	public void setPrenomEns(String prenomEns) {
		this.prenomEns = prenomEns;
	}

	public String getAdrEns() {
		return AdrEns;
	}

	public void setAdrEns(String adrEns) {
		AdrEns = adrEns;
	}

	public String getDiplomeEns() {
		return DiplomeEns;
	}

	public void setDiplomeEns(String diplomeEns) {
		DiplomeEns = diplomeEns;
	}

	public List<Seance> getSeance() {
		return seance;
	}

	public void setSeance(List<Seance> seance) {
		this.seance = seance;
	}
}