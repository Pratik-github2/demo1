package com.jsp.demo;

import java.util.Scanner;

public class SecLargestEleArray1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int [size];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int m1=0,m2=0;
		for(int i=0;i<a.length;i++) {
			if(m1<a[i]) {
				m1=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(m2<a[i] && m1>a[i]) {
				m2=a[i];
			}
		}
		System.out.println(m2);
	}

}
