package com.kajiya.javalab;

public class OneStatementLambda {
	
	//Using lambda to implement an interface with just one method
	//One statement only, if more you can use brackets after the '->'
	public static void main(String[] args) {
		InterfaceWithOneMethod iwom = () -> System.out.println(Math.random());
		iwom.execute();
	}
	
	public interface InterfaceWithOneMethod {		
		void execute();
	}
}
