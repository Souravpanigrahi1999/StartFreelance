package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class Reverse {

	public int reverseLogic(int input) {
		int reverse=0;
		while (input!=0) {
			reverse=reverse*10;
			reverse=reverse+input%10;
			input=input/10;
		}
		System.out.println("reverse"+reverse);
		return reverse;
	}
}