package com.lav.lambda;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectStreamExample {

	public List<String> givenList = Arrays.asList("1", "2", "3", "4", "5", "1", "2");

	public static void main(String[] args) {

		CollectStreamExample currentInst = new CollectStreamExample();

		System.out.println("List is: " + currentInst.getCollectedList().toString());
		System.out.println("Set is: " + currentInst.getCollectedSet().toString());
		System.out.println("Linked list is: " + currentInst.getCollectedLinkedList().toString());

	}

	private List<String> getCollectedList() {
		return givenList//
				.stream()//
				.collect(toList());
	}

	private Set<String> getCollectedSet() {
		return givenList//
				.stream()//
				.collect(toSet());
	}

	private LinkedList<String> getCollectedLinkedList() {
		return givenList//
				.stream()//
				.collect(toCollection(LinkedList::new));
	}
}
