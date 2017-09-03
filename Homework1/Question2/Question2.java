/*
Question 2:
In a loop, read radiuses from a user. Calculate the area of a circle using 
the formula PI*r^2. Use the pow function, and the PI constant in the Math 
class. Pick your data types wisely. Exit when the user presses ^d. Show 
your output.

Work Cited:

I was having issues with the exception handleing so i found this:

https://stackoverflow.com/questions/32592922/try-catch-with-scanner

*/

import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Question2{
	public static void main(String[] args)throws IOException{
		
		
		BufferedWriter output = null;
		Scanner input = null;
		double radius = 0;
		input = new Scanner(System.in);
		
		output = new BufferedWriter(new FileWriter("Question2.txt"));
		do{
			
			System.out.println("\nEnter a radius value to compute the area.\nTo EXIT enter ^d");
			output.write("\nEnter a radius value to compute the area.\nTo EXIT enter ^d");
			input = new Scanner(System.in);
			
			if(input.hasNextDouble()){
				radius = input.nextDouble();
				if(radius < 0){
					System.out.println("You cannot have a negitive or zero radius");
				} 
			}
			else if(input.hasNext()){
				System.out.println("You have entered an incorrect value");
				radius = -1;
			}
			else{
				System.out.println("\nHave a nice day!\n");
				radius = -2;
			}
			
		}while(radius == -1);
		
		while(radius != -2){
			
			double area = Math.pow(radius,2)*(Math.PI);
				
			System.out.printf("\nThe area is " + area + ".\n");
			output.write("\nThe radius is " + radius + "and the area is "+ area +".\n");
		
			do{
				
				System.out.println("\nEnter a radius value to compute the area.\nTo EXIT enter ^d");
				output.write("\nEnter a radius value to compute the area.\nTo EXIT enter ^d");
				input = new Scanner(System.in);
				
				if(input.hasNextDouble()){
					radius = input.nextDouble();
				
					if(radius < 0){
						System.out.println("You cannot have a negitive radius");
						radius = -1;
					}
				}
				else if(input.hasNext()){
					System.out.println("You have entered an incorrect value");
					radius = -1;
				}
				else{
					System.out.println("\nHave a nice day!\n");
					radius = -2;
				}
			}while(radius == -1);
		}
	}
}