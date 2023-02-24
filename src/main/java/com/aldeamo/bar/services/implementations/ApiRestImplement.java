package com.aldeamo.bar.services.implementations;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.aldeamo.bar.model.DataService;
import com.aldeamo.bar.model.entity.ArraysObject;
import com.aldeamo.bar.repository.ArraysRepository;
import com.aldeamo.bar.services.ApiRestI;

@Service
public class ApiRestImplement implements ApiRestI {

	@Autowired
	ArraysRepository arraysRepository;

	@Override
	public List<Integer> get(int iterations, Integer dataID) {
		if (dataID.intValue() > 6 || dataID.intValue() < 0) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "VALOR DE dataID NO CUMPLE CON LAS CONDICIONES");
		}
		DataService dataService = new DataService();
		dataService.setNumbersIterations(databaseQuery(dataID));
		for (int numIter = 1; numIter <= iterations; numIter++) {
			Collections.reverse(dataService.getNumbersIterations());
			dataService.getDivisiblenumbers().clear();
			for (int index = 0; index < dataService.getNumbersIterations().size(); index++) {
				if (dataService.getNumbersIterations().get(index) % NUMEROSPRIMOS[numIter - 1] == 0) {
					dataService.getDivisiblenumbers().add(dataService.getNumbersIterations().get(index));
				} else {
					dataService.getNonDivisibleNumbers().add(dataService.getNumbersIterations().get(index));
				}
			}
			dataService.getNumbersIterations().clear();
			dataService.getNumbersIterations().addAll(dataService.getNonDivisibleNumbers());
			dataService.getResponse().addAll(dataService.getDivisiblenumbers());
			dataService.getDivisiblenumbers().clear();
			if (numIter != iterations) {
				dataService.getNonDivisibleNumbers().clear();
			}
		}
		dataService.getResponse().addAll(dataService.getNonDivisibleNumbers());
		return dataService.getResponse();

	}

	public List<Integer> databaseQuery(Integer dataID) {
		Optional<ArraysObject> tablaArrays = arraysRepository.findById(Integer.toString(dataID));
		if (tablaArrays.isPresent()) {
			return tablaArrays.get().getStackAsNumbers();
		}
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
				"NO EXISTE INFORMACION EN BASE DE DATOS PARA EL ID:" + dataID);
	}
}
