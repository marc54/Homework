/*
Question 3:
Write a program that randomly generates an integer between 1 & 12, and 
displays the English name of that month. Run the program & show the 
output.

Work Sited:

https://stackoverflow.com/questions/7961788/math-random-explained

*/

import java.util.*;
import java.lang.Math;

public class Question3{
	public static void main(String[] args){
		
		final int minimum = 1, maximum = 12;
		int	value = 0;
		int months = (maximum - minimum) + 1;
		Random number = new Random();
		     
		value = (int)(Math.random() * months) + minimum;
		
		System.out.println(value);
		
		if(value == 1 ){
			System.out.println("Janurary");
		}
		else if(value == 2){
			System.out.println("Feburary");
		}
		else if(value == 3 ){
			System.out.println("March")		;
		}
		else if(value == 4 ){
			System.out.println("April Fools");		
		}
		else if(value == 5 ){
			System.out.println("May")		;
		}
		else if(value == 6){
			System.out.println("June")		;
		}
		else if(value == 7){
			System.out.println("July")		;
		}
		else if(value == 8){
			System.out.println("Augest")	;	
		}
		else if(value == 9){
			System.out.println("September")	;	
		}
		else if(value == 10 ){
			System.out.println("October")	;	
		}
		else if(value ==  11){
			System.out.println("November")	;	
		}
		else if(value == 12){
			System.out.println("December")	;	
		}
	}
}
	
	