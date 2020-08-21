package com;

import java.util.Arrays;
import java.util.List;

public abstract class FindMinandMaxElements {
	public static void main(String[] args) {
		List<Integer> listint = Arrays.asList(1, 2, 5, 5, 6, 6, 7, 2);
		Integer productA = listint.stream().max((i, l) -> i.compareTo(l)).get();
		System.out.println("Max value : " + productA);

		Integer productB = listint.stream().min((i, l) -> i > l ? 1 : -l).get();
		System.out.println("Min value : " + productB);
	}
}
