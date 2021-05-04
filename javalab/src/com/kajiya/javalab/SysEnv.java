package com.kajiya.javalab;

import java.util.Map;

public class SysEnv {
	
	public static void main(String[] args) {
		Map<String, String> env = System.getenv();
		System.out.println("PATH: " + env.get("PATH"));
		
		System.out.println();
		for (String key: env.keySet())			
			System.out.println(key + ": " + env.get(key));			
	}
}
