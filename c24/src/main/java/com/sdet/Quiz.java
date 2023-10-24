package com.sdet;

import java.util.Scanner;

public class Quiz {
	
	
	public static void main(String[] args) {
		
//		String s1="Hello";
//		String s2="World";
//		String s3="HelloWorld";
//		String s4=s1+s2;
//		s4=s4.intern();
//		
//		System.out.println(s3==s4);
//		System.out.println(s3.equals(s4));
		
		int a= 10;
		int b= 20;
		
//new variable to swap numbers		
//		int c=a;
//		a=b;
//		b=c;
		
//		System.out.println(a+"swapped"+b);
		
//using + and -
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println(a+"swapped"+b);

		
//using * and / only if nonzero numbers
		
//		a=a*b; //10*20
//		b=a/b; //200/20
//		a=a/b; //200/10
//		
//		System.out.println(a+"swapped"+b);
//		

//reverse number
		
		String anum="aster";
		
//		Scanner sc=new Scanner(System.in);
//		
//		int num= sc.nextInt();
//		
//		// 1st algorithm
//		
//		int rev=0;
//		
//		while(num!=0)
//		{
//			rev=rev*10 + num%10;
//			num=num/10;
//			
//		}
		
		StringBuffer ss= new StringBuffer(anum);
		
		ss.reverse();
		
		String s1="ab";
		String s2=s1;
		System.out.println(s1+s2);
		
		
		
	}

}
