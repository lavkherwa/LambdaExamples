package com.lav.lambda;

import java.util.Arrays;
import java.util.List;

public class MatchCheckExample {

	public List<String> givenList = Arrays.asList("first", "second", "third");

	public static void main(String[] args) {

		MatchCheckExample currentInst = new MatchCheckExample();

		System.out.println("check exists with prefix: " + currentInst.existsWithPrefix("fir"));
		System.out.println("check none exists with prefix: " + currentInst.noneExistsWithPrefix("fir"));
		System.out.println("check all exists with prefix: " + currentInst.allExistsWithPrefix("fir"));
	}

	private boolean existsWithPrefix(String input) {
		return givenList//
				.stream()//
				.anyMatch(element -> element.startsWith(input));
	}

	private boolean noneExistsWithPrefix(String input) {
		return givenList//
				.stream()//
				.noneMatch(element -> element.startsWith(input));
	}

	private boolean allExistsWithPrefix(String input) {
		return givenList//
				.stream()//
				.allMatch(element -> element.startsWith(input));
	}

}
