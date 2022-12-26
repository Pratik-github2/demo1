package com.jsp.demo;

public class Absolute {
public static void main(String[] args) {
	int a=absolute (-9);
	System.out.println(a);
}

private static int absolute(int i) {
	if(i<0) {
		i=i*-1;
	}
	return i;
}
}
