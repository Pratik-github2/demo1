package com.jsp.demo;

public class Array1 {
public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6},{2,4,6}};
	
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			System.out.print(a[i][j]);
		}
		System.out.println( );
	}
}
}
