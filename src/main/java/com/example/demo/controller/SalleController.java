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
@RequestMapping(value = "/salle")
public class SalleController {
	@Autowired
	private SalleR salleService;

	@PostMapping("/add")
	public Salle ajouter(@RequestBody Salle salle) {
		return salleService.save(salle);
	}

	@GetMapping("/list")
	public List<Salle> Q1() {
		return salleService.findAll();
	}

	@PostMapping("/edit")
	public Salle modifier(@RequestBody Salle salle) {
		return salleService.save(salle);
	}

	@GetMapping("/get/{id}")
	public Optional<Salle> getSalle(@PathVariable Long id) {
		System.out.println("Id = " + id);
		return salleService.findById(id);
	}

	
	@GetMapping("/delete/{id}")
	public  HashMap<String, String> deleteSalle(@PathVariable Long id) {
		salleService.deleteById(id);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", "Deleted");
		return map;
	}
}
