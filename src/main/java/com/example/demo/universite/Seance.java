package com.example.demo.universite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import java.util.Collection;

@Entity
public class Seance implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdSeance;
	private Long dureSeance;
	private String sateSeance;
	@ManyToOne
	@JoinColumn(name = "code_Enseignant")
	private Enseignant enseignant;
	@ManyToOne
	@JoinColumn(name = "code_Cours")
	private Cours cours;
	@ManyToOne
	@JoinColumn(name = "code_Salle")
	private Salle salle;
	@ManyToOne
	@JoinColumn(name = "code_Groupe")
	private Groupe groupe;

	public Long getIdSeance() {
		return IdSeance;
	}

	public void setIdSeance(Long idSeance) {
		IdSeance = idSeance;
	}

	public Long getDureSeance() {
		return dureSeance;
	}

	public void setDureSeance(Long dureSeance) {
		this.dureSeance = dureSeance;
	}

	public String getSateSeance() {
		return sateSeance;
	}

	public void setSateSeance(String sateSeance) {
		this.sateSeance = sateSeance;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

}