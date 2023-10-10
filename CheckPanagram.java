package com.CloudVandanaAssignments.Java;

import java.util.Scanner;

public class CheckPanagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);
       // System.out.println(isPangram);
        
        if(isPangram)
        {
        	System.out.println("It is a Panagram");
        }
        else
        {
        	System.out.println("It is not a Panagram");
        }
    }

    public static boolean isPangram(String s) 
    {
        s = s.toLowerCase();

        boolean[] alphabetPresence = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                int index = c - 'a'; 
                alphabetPresence[index] = true; 
            }
        }

        for (boolean present : alphabetPresence) {
            if (!present) {
                return false; 
            }
        }

        return true; 
    }
}

