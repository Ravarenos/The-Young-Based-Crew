import java.util.Scanner;
import java.util.Random;

public class ConnectFour {
	public static void main(String[] args) {
		int board [][]= new int [6][7];
		for(int count=0;count>-1;count++){
			if (count==0)printBoard(board);
			user(board);
			computer(board);
		}
	}//end of the Main Method
	public static void printBoard(int matrix[][]){
		for(int row=0;row<matrix.length;row++){
			for(int column=0;column<matrix[row].length;column++){
				if(column==0) System.out.print("|");

				System.out.print(converter(matrix[row][column])+"|");
			}
			System.out.println();
		}//end of for loop
	}//end of printBoard Method
	public static void user(int matrix[][]){
		Scanner input = new Scanner(System.in);
		int choice=0;
		for(int i=1;i>0;i++){
			System.out.println("Drop a red disk at column (0-6):");
			choice= input.nextInt();
			if ((choice>6) || (choice<0)){
				System.out.println("Please enter a valid choice.");
			}//end of if
			else break;
		}//end of loop
		for(int row=matrix.length-1;row>=0;row--){
			if(matrix[row][choice]==0){
				matrix[row][choice]=1;
				System.out.println();
				printBoard(matrix);
				break;}
			if(row==0){
				System.out.println("Error, this coullumn is full!");
				System.out.println();
				continue;

			}
		}
	}//end of user
	public static void computer(int matrix[][]){
		Random  rn = new Random();
		int rand= rn.nextInt(7);
		for(int row=matrix.length-1;row>=0;row--){
			if(matrix[row][rand]==0){
				matrix[row][rand]=2;
				System.out.println();
				printBoard(matrix);
				System.out.println("The computer chose column:" + rand);
				break;}
			if(row==0){
				System.out.println();
				continue;}}

	}//end of dumb AI
	public static boolean winner(int matrix[][]){
		for(int row=0;row<matrix.length;row++){
			for(int column=0;column<matrix.length;column++){
				if
			}
		}
	}//end of winner
	public static String converter(int n){

		if(n == 1){
			return "R";
		}
		else if (n==2){
			return "Y";
		}
		else return " ";
	}
}//end of Connect Four Class

