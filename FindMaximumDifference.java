package com;

import java.util.Arrays;

public class FindMaximumDifference {
	public static void main(String[] args) {
		int ref;
		int[] array = { 2, 5, 1, 7, 3, 9, 5};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);	
		}		
		ref=array[array.length-1]-array[0];
		System.out.println(ref);	
	}

}
