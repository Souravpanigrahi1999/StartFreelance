package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class Stringreverse {
	public String reverseLogic(String input) {
		
		//String originalStr = "Hello";
	    String reversedStr = "";
	    System.out.println("Original string: " + input);
	        
	    for (int i = 0; i < input.length(); i++) {
	      reversedStr = input.charAt(i) + reversedStr;
	    }
	    
	    System.out.println("Reversed string: "+ reversedStr);
		return reversedStr;
	  }
	}

