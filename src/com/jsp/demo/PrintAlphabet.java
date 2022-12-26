package com.jsp.demo;

public class PrintAlphabet {
public static void main(String[] args) {
	String s=" ";
	for(int i=1;i<=26; i++) {
		char c=(char)(96+i);
		s=s+c;
		}
	System.out.println(s);		
}
}
