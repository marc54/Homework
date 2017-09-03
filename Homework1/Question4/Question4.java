/*
Question 4:
Feed a file that contains numbers into your program using command line 
redirection. Have your program read & print the file on the screen.
*/

import java.io.*;
import java.util.*;
public class Question4{
	public static void main(String[] args) throws FileNotFoundException{
		
		
		Scanner input  = new Scanner(System.in);
		
		while(input.hasNext()){
			
			int value = input.nextInt();
			System.out.print(value + " ");
				
		}
	}	
}