package com.jsp.demo;

public class Voter {
public static void main(String[] args) {
	Voter.dv(1, "pratik", 23, "panvel");
	Voter.dv(2, "prakash", 26, "panvel");
	Voter.dv(3, "prasad", 22, "panvel");
	Voter.dv(4, "pranav", 25, "panvel");
	Voter.dv(5, "praful", 17, "panvel");
	
}

private static void dv(int i, String string, int j, String string2) {
	

	System.out.println("voter id is :"+i);
	System.out.println("voter name is :"+string);
	System.out.println("voter age is :"+j);
	System.out.println("voter loc is :"+string2);
	System.out.println("====================================");
	
	
}
}
