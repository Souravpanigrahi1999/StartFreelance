package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class Factorial {
	static int factorialLogic(int n) {
		int i,fact=1;
		int number;
		 if (n == 0)    
			    return 1;    
			  else    
			    return(n * factorialLogic(n-1));
		 
		 System.out.println("factorial of:"+number+" "+fact);
		   
	}
	  
}
