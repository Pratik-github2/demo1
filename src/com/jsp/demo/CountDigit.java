package com.jsp.demo;

public class CountDigit {
public static void main(String[] args) {
	int n=6744468;
	int count=0;
	for(int i=n;i>0;i=i/10) {
		count++;
	}
	System.out.println(count);
}
}
