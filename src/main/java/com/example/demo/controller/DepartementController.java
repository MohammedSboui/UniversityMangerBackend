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
@RequestMapping(value = "/departement")
public class DepartementController {
	@Autowired
	private DepartementR dep;

	@PostMapping("/add")
	public Departement ajouter(@RequestBody Departement d) {
		return dep.save(d);
	}

	@GetMapping("/list")
	public List<Departement> listDeps() {
		return dep.findAll();
	}

	@PostMapping("/edit")
	public Departement modifierC(@RequestBody Departement departements) {
		return dep.save(departements);
	}

	@GetMapping("/get/{id}")
	public Optional<Departement> getDepartement(@PathVariable Long id) {
		System.out.println("Id = " + id);
		return dep.findById(id);
	}

	
	@GetMapping("/delete/{id}")
	public  HashMap<String, String> deleteCours(@PathVariable Long id) {
		dep.deleteById(id);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("data", "Deleted");
		return map;
	}
}
