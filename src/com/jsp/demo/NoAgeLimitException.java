package com.jsp.demo;

public class NoAgeLimitException extends Throwable {
			public NoAgeLimitException() {
				super("you are minor to vote");
			}

			public void PrintStackTrace() {
				// TODO Auto-generated method stub
				
			}
}
