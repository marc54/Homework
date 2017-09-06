/*
Question 3:
Write a program to check whether a string is a palindrome (a string that's 
the same forward and backwards, for eg, madamimadam)
*/

import java.util.*;

public class Question3{
	public static void main (String[] args){
		 
		 Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter a word or phrase to check if it's a palindrome: >>  ");
		
		
		while(input.hasNext()){
			int i =0;
			boolean checker = false;
		 
			String palindrome = input.nextLine();
		 
			char [] wordarray = palindrome.toCharArray();
		 
			int length = palindrome.length();
		
			while((length-i-1)>i){
				if (wordarray[i] != wordarray[length-i-1]){
					checker =  false;
				}
				else{
					checker = true;
				}
				i++;	
			}
			
			if (checker){
				System.out.printf("The word %s is a palindrome\n\n", palindrome);
			}
			else{
				System.out.printf("The word %s isnt a palindrome\n\n", palindrome);
			}
			System.out.printf("Enter a word or phrase to check if it's a palindrome: >>  ");
		}
	}
}




	
	
	