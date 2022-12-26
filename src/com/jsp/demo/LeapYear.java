package com.jsp.demo;

public class LeapYear {
public static void main(String[] args) {
	boolean a=isLeapYear(3876);
	System.out.println(a);
}

private static boolean isLeapYear(int i) {
	if(i%400==0 || i%4==0 && i%100!=0) {
		return true;
	}
	return false;
}
}
