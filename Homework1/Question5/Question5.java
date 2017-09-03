/*
Question 5:
Write a program that reads three 2D points A, B, and C from the user. 
Next, calculate the length of each side of the triangle using the 
distance formula: sqrt((x2-x1)^2+(y2-y1)^2). Finally, determine if it's a 
real triangle. For a triangle to be real, the sum of any two sides needs 
to be greater than the third. Make sure your output has some real and at 
least one fake triangle.
*/

import java.util.*;

public class Question5{
	public static void main(String [] args){
		
		//int[] coordinates1 = {0,0}, coordinates2 = {0,0}, coordinates3 = {0,0};
		Scanner input = new Scanner(System.in);
		
		do{	
			System.out.println("Pease enter 3 (x,y) coordinates");
			int x=0,y=0;
			int[][] coordinates = new int[3][2];
		 
			for(int i = 0; i <= 2; i++){
				System.out.println("Enter the X-value for coordinate" + (i+1));
				coordinates[i][0] = input.nextInt();
				System.out.println("Enter the Y-value for coordinate" + (i+1) );
				coordinates[i][1] = input.nextInt();
			
			}
			
			double[] distance = new double[3];
			
			distance[0] = Math.sqrt((coordinates[1][0]-coordinates[0][0])^2+(coordinates[1][1]-coordinates[0][1])^2); 
			distance[1] = Math.sqrt((coordinates[2][0]-coordinates[0][0])^2+(coordinates[2][1]-coordinates[0][1])^2);
			distance[2] = Math.sqrt((coordinates[2][0]-coordinates[1][0])^2+(coordinates[2][1]-coordinates[1][1])^2);
		 
			if (distance[0] +distance[1] > distance[2]){
				System.out.println("The coordinates create a triangle");
			}
			else{
				System.out.println("Fake triangle was input");
			}
		 
			System.out.println("Enter ^z to Exit or Enter new X-Value For coordinate 1");
		}while(input.hasNext());
	}
}