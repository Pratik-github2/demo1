package com.jsp.demo;

public class Methods_Calling {
public static void main(String[] args) {
	System.out.println("Main Method Started ");
	Methods_Calling.display();
	System.out.println("Main Method Ended");
	
}

private static void display() {
	System.out.println("Display Method Shows");
	Methods_Calling.any();
	
	
}

private static void any() {
	System.out.println("Any Method Called");
	
}
}
