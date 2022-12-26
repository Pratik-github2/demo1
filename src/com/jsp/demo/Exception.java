package com.jsp.demo;

public class Exception  {
	
	public static void main(String[] args){
		int a=10;
		int b=0;
		int ar[]=new int [3];
		
		try {
			int c=a/b;
			System.out.println(c);
			System.out.println(ar[5]);
		}
		catch (ArithmeticException e){
			
			System.out.println("/by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("NO such index");
		}
//		catch( Exception e) {
//			System.out.println("Parent call");
//		}
		
		
	}
	
}
