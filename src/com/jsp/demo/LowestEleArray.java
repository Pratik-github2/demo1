package com.jsp.demo;

import java.util.Iterator;

public class LowestEleArray {
public static void main(String[] args) {
	int a[]=new int[] {212,3736,228,526,22};
	int min=a[0];
	for(int i=0; i<a.length; i++) {
		if(min>a[i])
			min=a[i];
		
	}
	System.out.println(min);
}
}
