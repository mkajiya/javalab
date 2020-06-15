package com.kajiya.javalab;

import java.util.ArrayList;
import java.util.List;

public class StreamTests {
	
	public static void main(String[] args) {
		filterString();
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

}
