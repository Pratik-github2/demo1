package com.jsp.demo;

public class MethodCalling {
      public static int test() {
    	  System.out.println("Test begin");
    	  System.out.println(a);
    	  System.out.println(i);
    	  System.out.println("Test ends");
    	  
		return 60;
    	  
		
      }
      static int a=10;
      static int i=test();
      public static void main(String[] args) {
		System.out.println("Main Method Begin");
		test();
		System.out.println("Main Method ended");
	}
}
