package com.jsp.demo;

import java.util.Arrays;
import java.util.Scanner;

public class SecLargestebUser {

	public static void main(String[] args)
	  {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    
	    int a[]=new int[size];
	    for(int i=0; i<a.length; i++) {
	    	a[i]=sc.nextInt();	
	    }
	    
	    int m1 = 0;int m2=0;
	    for(int i=0; i<a.length; i++) {
	    	if(a[i]>m1) {
	    		m1=a[i];
	    	}
	    }
	    
	    for(int i=0; i<a.length; i++) {
	    	if(a[i]>m2 && a[i]<m1) {
	    		m2=a[i];
	    	}
	    }
	    System.out.println(m2);
	    
	  }
}
