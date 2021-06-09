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
@RequestMapping(value = "/enseignant")
public class EnseignantController {
	@Autowired
	private EnseignantR en;

	@PostMapping("/add")
	public Enseignant ajouterEN(@RequestBody Enseignant e) {
		return en.save(e);
	}

	@GetMapping("/list")
	public List<Enseignant> Q1() {
		return en.findAll();
	}

	@PostMapping("/edit")
	public Enseignant modifierEN(@RequestBody Enseignant enseignant) {
		return en.save(enseignant);
	}

	@GetMapping("/get/{id}")
	public Optional<Enseignant> getEnseignant(@PathVariable Long id) {
		System.out.println("Id = " + id);
		return en.findById(id);
	}

	
	@GetMapping("/delete/{id}")
	public  HashMap<String, String> deleteEnseignant(@PathVariable Long id) {
		en.deleteById(id);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", "Deleted");
		return map;
	}
}
