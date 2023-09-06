package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class Swapping {
	
	public void swappLogic(int a,int b) {
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("swapping"+a+""+b);
				
	}
}
