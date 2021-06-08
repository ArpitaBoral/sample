package com.capg.jse.Lab3;
import java.util.*;

public class Exercise1 {
 public static void main(String args[]) {
	 int sum=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number as a string:");
	 String a=sc.nextLine();
	 StringTokenizer st=new StringTokenizer(a," ");
	 while(st.hasMoreElements()) {
		 int i=Integer.parseInt(st.nextToken());
		 System.out.println(i);
		 sum+=i;
	 }
	 System.out.println("sum is:"+sum);
 }
}
