package com.aldeamo.bar;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.aldeamo.bar.controller.ApiRestController;
import com.aldeamo.bar.model.DataService;
import com.aldeamo.bar.services.implementations.ApiRestImplement;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class ApiRestImplementTest {

	static DataService dataService;

	@InjectMocks
	ApiRestController controller;

	@InjectMocks
	ApiRestImplement services;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		Mockito.when(services.get(3, 2)).thenReturn(dataService.getResponse());
	}

	@BeforeAll
	static void setup() {
		dataService = new DataService();
	}

	@Test
	@Order(1)
	public void testOK() {
		ResponseEntity<List<Integer>> response = controller.get(3, 2);
		Assertions.assertEquals(dataService, response);
	}
}
