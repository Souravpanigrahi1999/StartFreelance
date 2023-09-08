package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class Pallindrome {
	public void pallindromeLogic(int n) {
		int r;
		int sum=0;
		int input;
		input=n;
		while(n>0){    
			   r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
		  if(input==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
		
	}

}
