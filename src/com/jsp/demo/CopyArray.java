package com.jsp.demo;

public class CopyArray {
public static void main(String[] args) {
	char[] copyFrom= {'i','a','m','p','r','a','t','i','k'};
	char [] copyTo=new char[6];
	
	System.arraycopy(copyFrom,3,copyTo,0,6);
	
	System.out.println(String.valueOf(copyTo));
	
	
}
}
