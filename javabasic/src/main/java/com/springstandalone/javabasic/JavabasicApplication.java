package com.springstandalone.javabasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavabasicApplication implements CommandLineRunner{
	
	
	@Autowired
	private Factorial factorial;
	
	@Autowired
	private Pallindrome pallindrome;
	
	@Autowired
	private Swap2 swapping1;
	
	@Autowired
	private Reverse reverse; //create object in autowired
	
	@Autowired
	private Swapping swapping;

	public static void main(String[] args) {
		SpringApplication.run(JavabasicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Reverse reverse1=new Reverse();  // reverse oject creation
		//int reverse=reverse1.reverseLogic(382);  //object call
		//System.out.println("reverse"+reverse); //print
		//Swapping obj=new Swapping();  //swap object creation
		//swapping.swappLogic(10, 30); //direct object call
		//reverse.reverseLogic(783);	//direct call to object 
		//swapping1.swapLogic(30,50);
		//pallindrome.pallindromeLogic(323);
		factorial.factorialLogic(4);
	}
		
}