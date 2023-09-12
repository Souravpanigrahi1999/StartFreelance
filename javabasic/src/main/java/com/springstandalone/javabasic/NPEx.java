package com.springstandalone.javabasic;

import org.springframework.stereotype.Service;

@Service
public class NPEx {
	public void npLogic(int input){
		int x=0;
		try {
			 x=input/0;
		}catch(Exception ex) {
			System.out.println("no result");
		}
		
		System.out.println(x);
	}
	public boolean checkVoterAge(int input) {
		if(input>=18)
			return true;
		else
			throw new UnderageException("you are not eligible sourav ");
	}
}
