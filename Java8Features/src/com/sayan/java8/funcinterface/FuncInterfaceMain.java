package com.sayan.java8.funcinterface;


@FunctionalInterface
interface Calculation {
	int operate(int a,int b);
}

public class FuncInterfaceMain {
	
	public static void main(String[] args) { 
		Calculation c = (a,b) -> (a + b);
		System.out.println("Add result : "+c.operate(10, 20));
		
		c = (a,b) -> (a - b);
		System.out.println("Add result : "+c.operate(20, 15));
		
	}

}
