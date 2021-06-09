package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.*;
import com.example.demo.universite.*;

@RestController
@RequestMapping(value = "/etudiant")
public class EtudiantsController {
	@Autowired
	private EtudiantR et;

	@PostMapping("/addE")
	public Etudiant ajouterE(@RequestBody Etudiant e) {
		return et.save(e);
	}

	@GetMapping("/list")
	public List<Etudiant> Q1() {
		return et.findAll();
	}

	@PostMapping("/editE")
	public Etudiant modifierE(@RequestBody Etudiant etudiant) {
		return et.save(etudiant);
	}

	@GetMapping("/getE/{id}")
	public Optional<Etudiant> getEtudiant(@PathVariable Long id) {
		System.out.println("Id = " + id);
		return et.findById(id);
	}

	@GetMapping("/searchE/{keyword}")
	public List<Etudiant> getEtudiantBy(@PathVariable String keyword) {
		Etudiant criteria = new Etudiant();
		criteria.setNomEt(keyword);
		criteria.setPrenomEt(keyword);

		ExampleMatcher matcher = ExampleMatcher.matchingAny().withIgnoreCase()
				.withStringMatcher(StringMatcher.CONTAINING);

		return et.findAll(Example.of(criteria, matcher));
	}
	
	@GetMapping("/deleteE/{id}")
	public  HashMap<String, String> deleteEtudiant(@PathVariable Long id) {
		et.deleteById(id);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", "Deleted");
		return map;
	}
}
