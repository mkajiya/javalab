package com.kajiya.javalab;

import java.util.Arrays;

public class StringJoin {
	
	public static void main(String[] args) {		
		String[] list = {"1", "2", "3"};
		System.out.println(String.join("\n", Arrays.asList(list)));		
	}

}
