package com.kajiya.javalab;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Reduce {
	
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
		
		Long longTest = 0l;		
		try {
			longTest = testList.stream().map(t -> t.getValue()).reduce(Long::sum).get();
		} catch (NoSuchElementException e) {
			longTest = 100l;
		}
		System.out.println(longTest);				
		
		longTest = testList.stream().mapToLong(t -> t.getValue()).sum();
		System.out.println(longTest);
				
		testList.add(new Test("one", 1l));
		testList.add(new Test("two", 2l));
		testList.add(new Test("three", 3l));
		
		try {
			longTest = testList.stream().map(t -> t.getValue()).reduce(Long::sum).get();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
		
		System.out.println(longTest);		
	}
}
