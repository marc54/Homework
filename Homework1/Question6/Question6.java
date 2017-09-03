/*
Question 6: 
Write a program that prompts the user to enter the center coordinates and 
radiuses of two circles. Determine whether the circles are separate from 
each other, touching each other, overlapping each other, or completely 
within one another. Test each case and show the output.

*/

import java.util.*;

public class Question6{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		do{	
			System.out.println("Pease enter the (x,y) coordinates and radius of 2 circles");
		
			int[][] coordinates = new int[2][2];
			int[] radius = new int[2];
		 
			for(int i = 0; i <= 1; i++){
				System.out.println("Enter the X-value for circle " + (i+1));
				coordinates[i][0] = input.nextInt();
				System.out.println("Enter the Y-value for cirlce " + (i+1) );
				coordinates[i][1] = input.nextInt();
				System.out.println("Enter the radius for circle");
				radius[i] = input.nextInt();
			}
		
			double distance = Math.sqrt((coordinates[1][0]-coordinates[0][0])^2+(coordinates[1][1]-coordinates[0][1])^2); 
			
			if(distance == 0){
				
				if(radius[0]>radius[1] || radius[1]>radius[0]){
					System.out.println("The circles are within each other");
				}
				else{
					System.out.println("The circles are touching at every point");
				}
			}
			else if((radius[0] +radius[1]) <distance){
				System.out.println("The Circles don't overlap.");
			}
			else if (radius[0] + radius[1] > distance ){
				
				if(distance + radius[0] < radius[1] || distance + radius[1] < radius[0]){
					System.out.println("The circles are completely within each other");
				}
				else{
				System.out.println("The circles overlap");
				}
			}
			else if((radius[0] + radius[1]) == distance){
			 System.out.println("The circles touch");
			}
		 
			System.out.println("Enter ^z to Exit or Enter new X-Value For circle 1");
		}while(input.hasNext());
	}
}