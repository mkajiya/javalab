package com.kajiya.javalab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTests {
	
	public static void main(String[] args) {
		filterString();
		
		List<Integer> test = List.of(1, 5, 10, 15, 20, 25);
		filterIntegerBiggerThan10(test).stream().forEach(i -> System.out.println(i));
	}
	
	private static void filterString() {
		List<String> titles = new ArrayList<>();		
		titles.add("TITLE1");
		titles.add("TITLE2");
		titles.add("TITLE3");
		titles.add("TITLE4");
		titles.add("TITLE5");
		titles.add("TITLE6");
		titles.add("TITLE7");
		titles.add("TITLE8");
		titles.add("TITLE9");
		titles.add("TITLE10");
		
		titles.stream().filter(s -> s.contains("1")).forEach(s -> System.out.println(s));
	}
	
	private static List<Integer> filterIntegerBiggerThan10(List<Integer> input) {
		return input.stream().filter(i -> i > 10).collect(Collectors.toList());
	}

}
