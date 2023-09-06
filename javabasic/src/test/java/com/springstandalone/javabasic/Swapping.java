package com.springstandalone.javabasic;
import java.util.*;
public class Swapping {

	public static void main(String[] args) {
		int a,b,c;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the first number a");
			a=sc.nextInt();
			System.out.println("enter the second number b");
			b=sc.nextInt();
		}
		System.out.println("before swapping"+a+""+b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping:"+a+""+b);
		// TODO Auto-generated method stub

	}

}
