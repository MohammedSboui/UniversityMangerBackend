package com.example.demo.universite;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

@Entity
public class Groupe implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGroupe;
	private String niveauGroupe;
	@JsonIgnore
	@OneToMany(mappedBy = "groupe")
	private List<Seance> seance;
	@JsonIgnore
	@OneToMany(mappedBy = "groupe")
	private List<Etudiant> etudiant;

	public Long getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(Long idGroupe) {
		this.idGroupe = idGroupe;
	}

	public String getNiveauGroupe() {
		return niveauGroupe;
	}

	public void setNiveauGroupe(String niveauGroupe) {
		this.niveauGroupe = niveauGroupe;
	}

	public List<Seance> getSeance() {
		return seance;
	}

	public void setSeance(List<Seance> seance) {
		this.seance = seance;
	}

	public List<Etudiant> getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(List<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}
}