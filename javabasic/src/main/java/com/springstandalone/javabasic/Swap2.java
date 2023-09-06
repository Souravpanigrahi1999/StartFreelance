package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class Swap2 {
	
	public void swapLogic(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapping with out using third variable"+a+" "+b);
	}
}
