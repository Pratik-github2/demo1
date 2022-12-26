package com.jsp.demo;

public class SubString {
	public static boolean checkSubString(String s1, String s2) {
			for(int i=0; i<s1.length(); i++) {
				int j=0;
				if(s1.length()>s2.length()) {
					while(j<s2.length()) {
						if(s1.charAt(i)!=s2.charAt(j)) {
							return true;
						}
						j++;
					}
//					
				}
			}
		return false ;	
	}
	public static void main(String[] args) {
		String s1="madam";
		String s2="ma";
		System.out.println(checkSubString(s1, s2));
	}
	
	
	
}
