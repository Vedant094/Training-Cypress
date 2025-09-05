package arraysdemo;

/**
* Author  : Vedant.Raturi
* Date    : Sep 2, 2025
* Time    : 11:57:10 AM
* Project : CoreJava

*/

public class MatrixAddition {

	public static void main(String[] args) {
		//Define two 2x3 matrices
		
		
		int[][] matrix1={{1,2,3},{4,5,6}};
		
		int[][] matrix2= {{7,8,9},{10,11,12}};
		
		
		//Create a result matrix with same size
		int rows=matrix1.length;
		int cols=matrix1[0].length;
		int [][] result=new int[rows][cols];
		
		//Perform matrix addition
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
			
		//Display the result
			
			for (int j = 0; j < rows; j++) {
				for (int j2 = 0; j2 < cols; j2++) {
					System.out.print(result[j][j2] + " ");
				}
				System.out.println();
			}
		

	}

}
