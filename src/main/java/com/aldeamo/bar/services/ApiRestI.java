package com.aldeamo.bar.services;

import java.util.List;

public interface ApiRestI {

	public static int[] NUMEROSPRIMOS = { 2, 3, 5, 7, 11, 13, 17 };

	public List<Integer> get(int iterations, Integer dataID);
}