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

/**
 * @author Jefferson Alexander Moreno Barrera
 *         {@code public class ApiRestController}
 */

@RestController
@RequestMapping(path = "/V1/API/")
public class ApiRestController {

	@Autowired
	ApiRestImplement apiRestImplement;

	/**
	 * Metodo para retornar lista de numeros ordenados despues de las iteraciones
	 * realizadas.
	 * 
	 * @param numero     de iteraciones a realizar (Q)
	 * @param representa 'id' de la pila en base de datos
	 * @return lista de numeros iterados
	 * @Throw ResponseStatusException datos de entrada incorrectos
	 */
	@GetMapping("get")
	public ResponseEntity<List<Integer>> get(@RequestParam("iterations") int iterations,
			@RequestParam("dataID") int dataID) {
		if (iterations == 0 || dataID == 0) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "DATOS DE ENTRADA REQUERIDOS");
		}
		return new ResponseEntity<>(apiRestImplement.get(iterations, dataID), HttpStatus.OK);
	}
}
