package com.jsp.demo;

public class Recursion {
	public static void Getnum(int n) {
		if(n<6) {
			System.out.println(n);
			n++;
			Getnum(n);
		}
	}
	public static void main(String[] args) {
		Getnum(0);
	}
}

