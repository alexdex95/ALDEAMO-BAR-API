package com.aldeamo.bar.model.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "arrays")
public class ArraysObject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "input_array", nullable = false)
	private String numbers;

	public ArraysObject() {
	}

	public ArraysObject(String numbers) {
		this.numbers = numbers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumbers() {

		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

	/**
	 * Metodo para organizar los datos de la base de datos.
	 * 
	 * @return lista de numeros luego de hacerle split
	 */
	@JsonIgnore
	public List<Integer> getStackAsNumbers() {

		String[] stackText = numbers.split(",");

		List<Integer> stackInteger = new ArrayList<>(stackText.length);
		for (String current : stackText) {
			stackInteger.add(Integer.parseInt(current));
		}

		return stackInteger;
	}
}
