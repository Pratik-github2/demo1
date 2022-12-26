package com.jsp.demo;

public class ReturnCodePractice {
public static void main(String[] args) {
	int a=fact(6);
	System.out.println(a);
	System.out.println(fact(5));
}

private static int fact(int i) {
	int p=1;
	while(i>1) {
		p*=i;
		i--;
	}
	System.out.println("Fact Method called");
		return p;
}
}
