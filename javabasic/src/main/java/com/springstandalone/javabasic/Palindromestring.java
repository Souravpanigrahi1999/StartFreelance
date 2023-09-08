package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class Palindromestring {
	public String palindromeLogic(String input) {
		String reverseStr = "";
	    
	    int strLength = input.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + input.charAt(i);
	    }

	    if (input.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(" is a Palindrome String:"+input);
	    }
	    else {
	      System.out.println(" is not a Palindrome String:" +input);
	}
		return reverseStr;

    }
  }
