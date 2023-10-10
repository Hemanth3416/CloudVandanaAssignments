package com.CloudVandanaAssignments.Java;

import java.util.*;

public class Roman_toInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roman Numbers (I,V,X,L,C,D,M)");
		String romanNumeral = sc.next();		 
		int result = romanToInteger(romanNumeral);
		System.out.println(result);
	}    
	public static int romanToInteger(String s) 
	{
	    Map<Character, Integer> romanToInt = new HashMap<>();
	    romanToInt.put('I', 1);
	    romanToInt.put('V', 5);
	    romanToInt.put('X', 10);
	    romanToInt.put('L', 50);
	    romanToInt.put('C', 100);
	    romanToInt.put('D', 500);
	    romanToInt.put('M', 1000);

	    int total = 0;
	    int prevValue = 0;

	    for (int i = s.length() - 1; i >= 0; i--) {
	        int currValue = romanToInt.get(s.charAt(i));

 	        if (currValue < prevValue) {
	            total -= currValue;
	        } else {
	            total += currValue;
	        }

	        prevValue = currValue;
	    }

	    return total;
	}
}

