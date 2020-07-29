package com.kajiya.javalab;

import java.util.ArrayList;
import java.util.List;

public class TestStringReduce {
	
	public static class Test {		
		private String label;
		private Long value;
		
		public Test(String label, Long value) {
			this.label = label;
			this.value = value;
		}
		
		public String getLabel() {
			return label;
		}
		
		public Long getValue() {
			return value;
		}		
	}
	
	public static void main(String[] args) {		
		List<Test> testList = new ArrayList<>();
		System.out.println("Result: " + reduce(testList));		
		
		testList.add(new Test("one", 1l));
		testList.add(new Test("two", 2l));
		testList.add(new Test("three", 3l));
		System.out.println("Result: " + reduce(testList));		
	}
	
	private static String reduce(List<Test> testList) {
		return testList
				.parallelStream()
				.reduce("", (agg, tl) -> tl.getLabel() + " " + tl.getValue() + "\n", String::concat);
	}
}
