package com.jsp.demo;

public class ThreeDigit {
public static void main(String[] args) {
	boolean c=isThreeDigit(777);
	System.out.println(c);
}

private static boolean isThreeDigit(int i) {
	if(i>99&&i<1000) {
		System.out.println("It is three digit no");
		return true;
	}
	return false;
}
}
