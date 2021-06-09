package com.example.demo.universite;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Collection;

@Entity
public class Etudiant implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numEt;
	private String nomEt;
	private String prenomEt;
	private String adrEt;
	@ManyToOne
	@JoinColumn(name = "code_Groupe")
	private Groupe groupe;

	public Long getNumEt() {
		return numEt;
	}

	public void setNumEt(Long numEt) {
		this.numEt = numEt;
	}

	public String getNomEt() {
		return nomEt;
	}

	public void setNomEt(String nomEt) {
		this.nomEt = nomEt;
	}

	public String getPrenomEt() {
		return prenomEt;
	}

	public void setPrenomEt(String prenomEt) {
		this.prenomEt = prenomEt;
	}

	public String getAdrEt() {
		return adrEt;
	}

	public void setAdrEt(String adrEt) {
		this.adrEt = adrEt;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

}
