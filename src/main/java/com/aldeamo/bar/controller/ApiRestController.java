package com.aldeamo.bar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.aldeamo.bar.services.implementations.ApiRestImplement;

@RestController
@RequestMapping(path = "${context.path}")
public class ApiRestController {

	@Autowired
	ApiRestImplement apiRestImplement;

	@GetMapping("get")
	public ResponseEntity<List<Integer>> get(@RequestParam("iterations") int iterations,
			@RequestParam("dataID") Integer dataID) {
		if (iterations == 0 || dataID == 0) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DATOS DE ENTRADA REQUERIDOS");
		}
		return new ResponseEntity<>(apiRestImplement.get(iterations, dataID), HttpStatus.OK);
	}
}
