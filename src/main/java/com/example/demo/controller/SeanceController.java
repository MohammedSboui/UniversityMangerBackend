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
@RequestMapping(value = "/seance")
public class SeanceController {
	@Autowired
	private SeanceR seanceService;

	@PostMapping("/add")
	public Seance ajouter(@RequestBody Seance salle) {
		return seanceService.save(salle);
	}

	@GetMapping("/list")
	public List<Seance> Q1() {
		return seanceService.findAll();
	}

	@PostMapping("/edit")
	public Seance modifier(@RequestBody Seance salle) {
		return seanceService.save(salle);
	}

	@GetMapping("/get/{id}")
	public Optional<Seance> getSeance(@PathVariable Long id) {
		System.out.println("Id = " + id);
		return seanceService.findById(id);
	}

	
	@GetMapping("/delete/{id}")
	public  HashMap<String, String> deleteSeance(@PathVariable Long id) {
		seanceService.deleteById(id);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", "Deleted");
		return map;
	}
}
