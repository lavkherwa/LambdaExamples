package com.lav.lambda;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStatistics {

	public static void main(String[] args) {

		int[] numbers = new int[] { 102938, 213, 334, 444, 5442, 6221, 712 };

		IntSummaryStatistics stats = IntStream//
				.of(numbers)//
				.summaryStatistics();

		System.out.println("Min value: " + stats.getMin());
		System.out.println("Max value: " + stats.getMax());
		System.out.println("Avg value: " + stats.getAverage());
		System.out.println("Sum value: " + stats.getSum());
	}

}
