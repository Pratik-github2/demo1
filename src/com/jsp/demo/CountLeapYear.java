package com.jsp.demo;

public class CountLeapYear {
public static void main(String[] args) {
	int c=0;
	for(int i=1700; i<2000; i++) {
		if(isLeapYear(i)) {
			c++;
		}
		
	} System.out.println(c+" times leap year appears in between 1700 to 2000.");
}

private static boolean isLeapYear(int i) {
	
	return i%4==0 || i%400==0 && i%100!=0;
}
}
