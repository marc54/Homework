/*
Question 1:
Write a program that asks the user how tall of a pyramid do they want to 
display on the screen, and then displays the pyramid that counts up on the 
left, and counts down on the right. For eg, if the user enters 4, the 
program shows:
*/

import java.util.*;

public class Question1{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.printf("How tall of a pyramid do you wish to have? >> ");
			
		int x = input.nextInt();
		int counter = x;
		for (int k = 1; k < x+1 ;k++){
			int i = 0;
			
			for ( i = (counter -1);i>=0; i--){
				System.out.printf("   ");
			}
			
			for(  i = 0; i < k ; i++){
			    
				System.out.printf("%d  " , (i+1));
				
			}
		
			if(k!=1){
				for( i -- ; i>0 ; i--){ 
					System.out.printf("%d  ",i);
				}
			}
	
			System.out.printf("\n");
			counter--;
		}
	}
}