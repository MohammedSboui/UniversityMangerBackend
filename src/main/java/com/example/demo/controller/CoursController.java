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
@RequestMapping(value = "/cours")
public class CoursController {
	@Autowired
	private CoursR co;

	@PostMapping("/add")
	public Cours ajouterC(@RequestBody Cours c) {
		return co.save(c);
	}

	@GetMapping("/list")
	public List<Cours> Q1() {
		return co.findAll();
	}

	@PostMapping("/edit")
	public Cours modifierC(@RequestBody Cours cours) {
		return co.save(cours);
	}

	@GetMapping("/get/{id}")
	public Optional<Cours> getCours(@PathVariable Long id) {
		System.out.println("Id = " + id);
		return co.findById(id);
	}

	
	@GetMapping("/delete/{id}")
	public  HashMap<String, String> deleteCours(@PathVariable Long id) {
		co.deleteById(id);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", "Deleted");
		return map;
	}
}
