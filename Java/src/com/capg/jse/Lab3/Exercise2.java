package com.capg.jse.Lab3;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          getImage();
	}
	
	public static void getImage() {
		String s,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		s=sc.next();
		//int len=s.length();
		//for(int i=len-1;i>=0;i--) {
		// rev=rev+s.charAt(i);
		//	}
		StringBuffer sb=new StringBuffer(s);
		rev=sb.reverse().toString();
		
		
		System.out.println(s+"|"+rev);
	}

}
