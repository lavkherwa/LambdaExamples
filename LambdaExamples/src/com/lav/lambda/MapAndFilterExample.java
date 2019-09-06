package com.lav.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFilterExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("X:00120", "Y:03033", "X:37339", "X:28393");
		List<String> result = new ArrayList<>();

		/*
		 * Filter the values from list where first part before : is X and return all
		 * last values after :
		 */

		result = list//
				.stream()//
				.filter(value -> value.substring(0, value.lastIndexOf(":")).equals("X"))
				.map(value -> value.substring(value.lastIndexOf(":") + 1, value.length()))//
				.collect(Collectors.toList());

		System.out.println(result.toString());
	}

}
