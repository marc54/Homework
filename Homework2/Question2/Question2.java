/*

Question 2:
Write a program that displays a calendar on the screen. It asks the user 
the year, what day the first of January fell on, then displays every month 
from January to December. Make sure to get the leap years right. Your 
months should resemble the following format:

   February 2015      
Su Mo Tu We Th Fr Sa  
 1  2  3  4  5  6  7  
 8  9 10 11 12 13 14  
15 16 17 18 19 20 21  
22 23 24 25 26 27 28 


*/


import java.util.*;

public class Question2{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int year = 0;
		String day; 
		
		
		final String[] months = {"January", "February", "March", "April",
						"May", "June", "July", "Augest", "September", "October",
		                "November", "December"};
		
		final int[] days = { 31, 28 , 31 ,30 ,31,30,31,31,30,31,30, 31 };
		int dayholder =0 ;
		
		System.out.printf("Please enter the year: >> ");
		year = input.nextInt();
		System.out.printf("Please enter the day of week January 1st fell on: >> ");
		day = input.next();
		
		System.out.printf("You have chosen year: %d and day: %s\n" , year , day);
		
		if(day.equals("Sunday") || day.equals("sunday")){
			dayholder = 0;
		}else if(day.equals("Monday")|| day.equals("monday")){
			dayholder = 1;
		}else if(day.equals("Tuesday")|| day.equals("tuesday")){
			dayholder = 2;
		}else if(day.equals("Wednesday")|| day.equals("wednesday")){
			dayholder = 3;
		}else if(day.equals("thursday")|| day.equals("Thursday")){
			dayholder = 4;
		}else if(day.equals("Friday")|| day.equals("friday")){
			dayholder = 5;
		}else if(day.equals("Saturday")|| day.equals("saturday")){
			dayholder = 6;
		}else{
			System.out.println("Error");
		}

		for(int i = 0 ; i<12 ; i++){
			
			System.out.printf("%13s\n", months[i]);
			System.out.printf("Su Mo Tu We Th  Fr  Sa\n");
			
			if(dayholder!=0 && dayholder!= 6){
				System.out.printf("%"+(dayholder*4)+"s","");
			}
			if(dayholder == 6){
				System.out.printf("%"+((dayholder-1)*4)+"s","");
			}
			
			
			for( int j = 0; j<days[i] ; j++){
				dayholder++;
				
				System.out.printf("%2d  ", j+1);
				
				if(dayholder%6==0||dayholder%7==0){
					dayholder=0;
					System.out.printf("\n");
				}
				
			}
			if(months[i] == months[1]){
				if((year%4 ==0) && (year%100!=0)){
					System.out.printf("%2d  ",29);
					dayholder++;
					if(dayholder%6==0){
						dayholder=0;
						System.out.printf("\n");
					}
				}
				else if(year%400==0){
					System.out.printf("%2d  ",29);
					dayholder++;
					if(dayholder%6==0){
						dayholder=0;
						System.out.printf("\n");
					}
				}
					
				
			}
			
			System.out.printf("\n");
		}
	}
}