package com.capg.jse.Lab5;
import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first name and last name:");
		 String first=sc.nextLine();
		 String last=sc.nextLine();
		 System.out.println("Fname:"+first+"\n");
		System.out.println("Lname:"+last+"\n");
			 try {
				 if(first==null || last==null) {
					 throw new InvalidNameException("Enter the name correctly");
				 }
				 else
					 System.out.println("Full name is:"+first+" "+last);
			 }
			 catch(InvalidNameException ine) {
				 System.out.println(ine);
			 }
		 }
	 }
	

	class InvalidNameException extends Exception{
		public InvalidNameException(String a) {
			super(a);
		}
	}


