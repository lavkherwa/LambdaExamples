package com.lav.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapExample {

	public Map<Integer, String> givenMap = new HashMap<>();

	public static void main(String[] args) {

		FilterMapExample currentInst = new FilterMapExample();
		currentInst.givenMap.put(1, "lav kherwa");
		currentInst.givenMap.put(2, "kush kherwa");

		System.out.println("final value is: " + currentInst.getStreamResult());

	}

	private String getStreamResult() {

		return givenMap//
				.entrySet()//
				.stream()//
				.filter(element -> element.getValue().contains("kherwa") == true)//
				.map(element -> element.getValue() + "[Found]")//
				.collect(Collectors.joining(", "));

	}
}
