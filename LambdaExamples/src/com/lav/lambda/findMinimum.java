package com.lav.lambda;

import java.util.stream.IntStream;

public class findMinimum {

	public static void main(String[] args) {

		int[] numbers = new int[] { 102938, 213, 334, 444, 5442, 6221, 712 };

		int value = IntStream//
				.of(numbers)//
				.min()//
				.getAsInt();

		System.out.println("Minimum value is: " + value);

	}

}
