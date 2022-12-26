package com.jsp.demo;

import java.util.Arrays;

public class SecLargestELeArray {
public static void main(String[] args) {
	int a[]={10,30,42,45,32,44};
	int m1=a[0],m2=a[0];
	for(int i=0;i<a.length; i++) {
		if(a[i]>m1) {
			m1=a[i];
		}
	}
	for(int i=0; i<a.length; i++) {
		if (a[i]>m2 && a[i]<m1) {
			m2=a[i];
		}
	}
	System.out.println(m2);
}
	
}
