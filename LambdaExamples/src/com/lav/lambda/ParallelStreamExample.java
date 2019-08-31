package com.lav.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

	public List<String> givenList = Arrays.asList("first", "second", "third", "f-dummy");

	public static void main(String[] args) {

		ParallelStreamExample currentInst = new ParallelStreamExample();

		System.out.println("elements with prefix are: " + currentInst.getWithPrefix("f").toString());

	}

	private List<String> getWithPrefix(String input) {

		List<String> result = new ArrayList<>();

		givenList//
				.parallelStream()//
				.filter(element -> element.startsWith(input) == true)//
				.forEach(element -> result.add(element));

		return result;

	}

}
