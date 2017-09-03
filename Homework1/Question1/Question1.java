
/*
Question 1:
Read the Brooklyn College academic integrity guidelines, and write a 
statement attesting to the fact that you read, understood and agree to all 
of it.
*/

import java.io.*;

public class Question1{
	public static void main(String[] args) throws IOException{
		
		String attest = "\nI, Marc Pfeiffer, attest to  the fact that I read, understand and agree to all\nof brookln Colleges academic integrity guidelines which can be found at \nHttp://www.Brooklyn.Cuny.edu/web/about/initiatives.php.";
		System.out.println(attest);
		
		BufferedWriter output = null;
		
		try{
			output = new BufferedWriter(new FileWriter("Question1.txt"));
			output.write(attest);
		}finally{
			output.close();
		}
	}
}