/*
Question 5:
Change Scanner's delimiter, and tokenize comma separated values entered by 
the keyboard.
*/

import java.util.*;

public class Question5{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		input.useDelimiter(",");

		while(input.hasNext()){
			System.out.println(input.next());
		}
		
	}
}
	