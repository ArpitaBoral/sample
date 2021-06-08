package com.capg.jse.Lab2;
import java.util.Scanner;
import java.util.Arrays;

public class Exercise1 {
 public static void getSecondSmallest() {
	 int n;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number of elements:");
	 n=sc.nextInt();
	 int[] arr=new int[n];
	 System.out.println("Enter the elements of the array:");
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
		 Arrays.sort(arr);
		 System.out.println("Second smallest element of array:"+arr[1]);
 }
 public static void main(String args[]) {
	 getSecondSmallest();
 }
}
