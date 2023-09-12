package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class Factorial {
	public int factorialLogic(int n) {
		int fact = 1;
		if (n == 0)
			return 1;
		else
			return (n * factorialLogic(n - 1));

	}
	  
}
