package com.lav.lambda;

import java.util.stream.IntStream;

public class FindDistinct3SmallestNumberArray {

	public static void main(String[] args) {

		int[] numbers = new int[] { 102938, 213, 334, 444, 5442, 6221, 712 };

		IntStream//
				.of(numbers)//
				.distinct()//
				.sorted()//
				.limit(3).forEach(System.out::println);

	}

}
