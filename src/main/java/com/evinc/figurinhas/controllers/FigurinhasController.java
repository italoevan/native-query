package com.evinc.figurinhas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evinc.figurinhas.entities.FigurinhaEntity;
import com.evinc.figurinhas.repositories.FigurinhaRepository;

@RestController
@RequestMapping(path = "/getFigurinhas")

public class FigurinhasController {
	final FigurinhaRepository repository;

	public FigurinhasController(FigurinhaRepository repository) {
		this.repository = repository;
	}

	@GetMapping()
	public Iterable<FigurinhaEntity> getVoid() {
		return repository.findAll();
	}

	@PostMapping()
	public void newFigurinha(@RequestBody FigurinhaEntity figurinha) {
		repository.newFigurinha(figurinha.getDescription(), figurinha.getImage());
	}

}
