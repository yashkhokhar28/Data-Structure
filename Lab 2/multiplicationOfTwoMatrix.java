import java.util.*;

public class multiplicationOfTwoMatrix{
	public static void main(String[] args) {

		int row1,row2,column2,column1,i,j,k;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows For First Matrix : ");
		row1 = sc.nextInt();
		System.out.println("Enter Number Of Coulmns For First Matrix : ");
		column1 = sc.nextInt();

		int[][] matrix_1 = new int[row1][column1];

		System.out.println("Enter Elements Of First Matrix : ");
		for (i=0;i<row1;i++ ) {
			for (j=0;j<column1;j++ ) {
				matrix_1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter Number Of Rows For Second Matrix: ");
		row2 = sc.nextInt();
		System.out.println("Enter Number Of Coulmns For Second Matrix : ");
		column2 = sc.nextInt();

		int[][] matrix_2 = new int[row2][column2];

		System.out.println("Enter Elements Of Second Matrix : ");
		for (i=0;i<row2;i++ ) {
			for (j=0;j<column2;j++ ) {
				matrix_2[i][j] = sc.nextInt();
			}
		}

		System.out.println("--------Matrix-1 Data--------");
		for(i=0;i<row1;i++){
			for(j=0;j<column1;j++){
				System.out.print(matrix_1[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("--------Matrix-2 Data--------");
		for(i=0;i<row2;i++){
			for(j=0;j<column2;j++){
				System.out.print(matrix_2[i][j]+" ");
			}
			System.out.println();	
		}

		int[][] multiplication = new int[row1][column2];

		System.out.println("--------------Matrix Multiplication---------");

		for (i=0;i<row1;i++ ) {
			for (j=0;j<column2;j++ ) {
				for (k=0;k<column1;k++ ) {
					multiplication[i][j] = multiplication[i][j] + matrix_1[i][k] * matrix_2[k][j];
				}
				System.out.println(multiplication[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
