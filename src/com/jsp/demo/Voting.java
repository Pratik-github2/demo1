package com.jsp.demo;

public class Voting {
	public static void main(String[] args) {
		int age=8;
		try {
			if(age<18) {
				throw new NoAgeLimitException();
			}
		} catch(NoAgeLimitException e){
			e.PrintStackTrace(); 
			
		}
	}

}
