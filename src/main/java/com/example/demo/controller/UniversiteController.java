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
@RequestMapping(value = "/universite")
public class UniversiteController {
	@Autowired
	private UniversiteR univ;

	@PostMapping("/add")
	public Universite ajouter(@RequestBody Universite c) {
		return univ.save(c);
	}

	@GetMapping("/list")
	public List<Universite> Q1() {
		return univ.findAll();
	}

	@PostMapping("/edit")
	public Universite modifier(@RequestBody Universite univ) {
		return this.univ.save(univ);
	}

	@GetMapping("/get/{id}")
	public Optional<Universite> getUniversites(@PathVariable Long id) {
		System.out.println("Id = " + id);
		return univ.findById(id);
	}

	
	@GetMapping("/delete/{id}")
	public  HashMap<String, String> deleteUniv(@PathVariable Long id) {
		univ.deleteById(id);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", "Deleted");
		return map;
	}
}
