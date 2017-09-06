/*Question 6:
Your job is to tokenize individual characters. Your code looks like:

Scanner in = ...
in.useDelimiter()

while(in.hasNext()){
	print the current token.
}

What delimiter should you use here?

*/

import java.util.*;

public class Question6{
	public static void main (String[] args){
		
		Scanner input = new Scanner(System.in);
		input.useDelimiter("");

		while(input.hasNext()){
			
			System.out.println(input.next());
		}
		
	}
}
	