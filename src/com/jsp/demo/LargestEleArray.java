package com.jsp.demo;



public class LargestEleArray {
public static void main(String[] args) {
	int a[]=new int[] {12,78,22,629};
	int max =a[0];
	for(int i=0; i<a.length; i++) {
		if(a[i]>max)
			max=a[i];
	}
	System.out.println(max);
}
}
