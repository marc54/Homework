import java.util.*;

public class NQueens{
	
	private int queens = 0;
	
	void setQueens(){
		
		Scanner in = new Scanner(System.in);
		System.out.println("\n********************WARNING**********************\nThis program finds and prints all solutions to\nNQueens and any number exceeding 9 will take a long \ntime due to the fact that as n increases the amount\nof solutions increase exponetially\n");
		System.out.print("\nEnter the number of nQueens you want solved :: ");
		
		queens = in.nextInt();
	}
	
	void printSolution(int board[][]){
		for (int i = 0; i < queens; i++){
			for (int j = 0; j < queens; j++){
				if(board[i][j] == 1){
					System.out.printf(" %d::%d ",i+1,j+1);
				}
			}
			
		}
		System.out.println("");
	}
	boolean isSolution(int board[][]){
		int row=0, column=0;
		for(int i = 0 ; i <queens; i++){
			for(int j = 0; j <queens; j++){
				if(board[i][j] == 1){
					// check rows
					for(int k = 0 ; k<queens; k++){
						if(board[k][j] ==1 && k != i){
							return false;
						}
					}
					// check column
					for(int k = 0 ; k<queens; k++){
						if(board[i][k] ==1 && k != j){
							return false;
						}
					}
					
					// check up-left
					
					if(i != 0 && j != 0){
						for( row = i-1,  column = j-1; row>=0 && column >=0 ; row--, column--){
							
							if(board[row][column] ==1){
								return false;
							}
						}
					}
					
					//check up right
					if(i != 0 && j != (queens-1)){
						for( row = i-1,  column = j+1; row>=0 && column <queens ; row--, column++){
							
							if(board[row][column] ==1){
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}
	boolean endSearch(int board[][]){
		for (int i = 0; i < queens; i++){
			if(board[queens-1][i] != 1){
				return false;
			}
		}
		return true;
	}
	void moveQueen(int board[][],int column){
		if(column ==0){
			return;
		}
		for(int i = 0 ; i< queens ; i++){
			if(board[i][column-1]==1){ 
				if( i!= queens-1){
					board[i][column-1] = 0;
					board[i+1][column-1] = 1;
					return;
				}
				else{
					board[queens-1][column-1] =0;
					board[0][column-1] =1;
					
					moveQueen(board, column-1);
				}
			}	
		}	
	}

	
	
	
	void solve(){
		int board[][] = new int[queens][queens];
		int count = 0;
		for(int i = 0 ; i < queens ; i++){
			board[0][i] = 1;
		}
		System.out.println("");
		while(!endSearch(board)){
			
			moveQueen(board,queens);
			
			
			if(isSolution(board)== true){
				count ++;
				System.out.printf("Solution # %02d >> ", count);
				printSolution(board);
			}
			
		}
		System.out.printf("\n%15d SOLUTIONS FOUND\n\n", count);
	}
	
	
	
	public static void main(String[] args){
		
		NQueens solutionSet = new NQueens();
		solutionSet.setQueens();
		solutionSet.solve();
	}
}