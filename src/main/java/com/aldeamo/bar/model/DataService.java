package com.aldeamo.bar.model;

import java.util.ArrayList;
import java.util.List;

public class DataService {

	List<Integer> numbersIterations = new ArrayList<>();
	List<Integer> divisiblenumbers = new ArrayList<>();
	List<Integer> nonDivisibleNumbers = new ArrayList<>();
	List<Integer> response = new ArrayList<>();

	
	public List<Integer> getNumbersIterations() {
		return numbersIterations;
	}

	public DataService() {
		super();
	}

	public void setNumbersIterations(List<Integer> numbersIterations) {
		this.numbersIterations = numbersIterations;
	}

	public List<Integer> getDivisiblenumbers() {
		return divisiblenumbers;
	}

	public void setDivisiblenumbers(List<Integer> divisiblenumbers) {
		this.divisiblenumbers = divisiblenumbers;
	}

	public List<Integer> getNonDivisibleNumbers() {
		return nonDivisibleNumbers;
	}

	public void setNonDivisibleNumbers(List<Integer> nonDivisibleNumbers) {
		this.nonDivisibleNumbers = nonDivisibleNumbers;
	}

	public List<Integer> getResponse() {
		return response;
	}

	public void setResponse(List<Integer> response) {
		this.response = response;
	}

}
