package com.jsp.demo;

import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
	int a[]=new int[4];
	int a1[]= {1,2,3,4,5};
	int sum=0;
	for(int i=0; i<a1.length; i++) {
//		a[i]=sc.nextInt();
		sum=sum+a1[i];
		double avg =sum/a1.length;
		System.out.println(avg);
	}
	
}
}
