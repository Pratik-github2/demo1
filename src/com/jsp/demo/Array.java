package com.jsp.demo;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
	int a[]=new int[4];
	
	 a[0]= 10;
	 a[1]=20;
	 a[2]=30;
	 a[3]=40;
	 
	 int b[]= {10,11,111,1111};
	 
	 for(int i=0; i<b.length; i++) {
		 System.out.println(b[i]);
	 }
	 System.out.println(a[3]);
	
	 for(int i=0; i<a.length; i++) {
		 System.out.println(a[i]);
	 }
	
	int c[]= {1,2,3,4,5};
	for(int i:c)
		System.out.println(i);
	
}
}
