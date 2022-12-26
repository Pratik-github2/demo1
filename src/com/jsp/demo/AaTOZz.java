package com.jsp.demo;

public class AaTOZz {
public static void main(String[] args) {
	String s="";
	for(int i=1; i<=26; i++) {
		char c=(char)(64+i);
		char c1=(char)(96+i);
		s=s+c+c1;
	}
	System.out.println(s);
}
}
