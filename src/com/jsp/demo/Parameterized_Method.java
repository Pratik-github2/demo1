package com.jsp.demo;

public class Parameterized_Method {
public static void main(String[] args) {
	System.out.println("Here we providing parameters in below method");
	Parameterized_Method.a(6+8*7);
	
}

private static void a(int n) {
	System.out.println(n);
	System.out.println(99);
}
}
