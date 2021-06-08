package com.capg.jse.collection;
import java.util.Scanner;
import java.util.HashMap;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Char array:");
       String s=sc.next();
       System.out.println(countChars(s.toCharArray()));
	}
	
	public static HashMap<Character,Integer> countChars(char[] a) {
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(hm.containsKey(a[i])) {
				int count=hm.get(a[i]);
				hm.put(a[i], ++count);
				}
			else
				hm.put(a[i], 1);
		}
		return hm;
		
	}

}
