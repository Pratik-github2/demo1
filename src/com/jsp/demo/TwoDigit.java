package com.jsp.demo;

public class TwoDigit {
public static void main(String[] args) {
	boolean c=isTwoDigit(10);
	System.out.println(c);
}

private static boolean isTwoDigit(int i) {
	if(i>9&&i<100) {
		System.out.println("It is two digit no");
		return true;
	}
	return false;
}
}
