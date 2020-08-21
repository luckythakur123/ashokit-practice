package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonElementsAmongBelow3Arrays {
	public static void main(String[] args) {
		List<Integer> ar4=new ArrayList<Integer>();
		List<Integer> ar1 = Arrays.asList(1, 5, 10, 20, 40, 80,90);
		List<Integer> ar2 = Arrays.asList(6, 7, 20, 80, 100,90);
		List<Integer> ar3 = Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120,90);
		
		for (Integer ref1 : ar1) {
			if(ar2.contains(ref1))
			{
				ar4.add(ref1);
			}
		}
		System.out.print("comman value :");
		for (Integer ref2 : ar4) {
			if(ar3.contains(ref2))
			{
				System.out.print("\t"+ref2);
			}
		}

	}
}
