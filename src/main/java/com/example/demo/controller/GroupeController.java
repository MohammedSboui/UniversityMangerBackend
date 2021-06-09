package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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
@RequestMapping(value = "/groupe")
public class GroupeController {
	@Autowired
	private GroupeR gr;

	@PostMapping("/addG")
	public Groupe ajouterG(@RequestBody Groupe g) {
		return gr.save(g);
	}

	@GetMapping("/list")
	public List<Groupe> Q1() {
		return gr.findAll();
	}

	@PostMapping("/editG")
	public Groupe modifierG(@RequestBody Groupe groupe) {
		return gr.save(groupe);
	}

	@GetMapping("/getG/{id}")
	public Optional<Groupe> getGroupe(@PathVariable Long id) {
		return gr.findById(id);
	}

	
	@GetMapping("/deleteG/{id}")
	public  HashMap<String, String> deleteGroupe(@PathVariable Long id) {
		gr.deleteById(id);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", "Deleted");
		return map;
	}
}
