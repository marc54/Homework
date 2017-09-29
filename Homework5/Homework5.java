import java.util.*;

public class Homework5{
	public static void main(String[] args){
		
		dot randomPoint;
		int numInside=0, numThrown=0;
		
		for (int i =0; i<1000000; i++){
			randomPoint = new dot();
			System.out.println(i);
			numThrown++;
			
			if(randomPoint.checker()==true){
				numInside++;
			}	
		}
		
		double pi = 4*(double)numInside/(double)numThrown;
		System.out.printf("The PI is approximatly: %f",pi);
		

	}
	
	
}

class dot{
	private double x;
	private double y;
	
	dot(){
		x = Math.random();
		y = Math.random();
		
	}
	public boolean checker(){
		if(Math.pow(x,2) + Math.pow(y,2) <= 1){
			return true;
		}
		else{
			return false;
		}
		
	}
}