import java.util.*;

public class multiplicationOfTwoMatrix{
	public static void main(String[] args) {

		int row,column,i,j,k;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Of Rows For First Matrix : ");
		row = sc.nextInt();
		System.out.println("Enter Number Of Coulmns For First Matrix : ");
		column = sc.nextInt();

		int[][] matrix_1 = new int[row][column];
		int[][] matrix_2 = new int[row][column];
		int[][] multiplication = new int[row][column];

		System.out.println("Enter Elements Of First Matrix : ");
		for (i=0;i<row;i++ ) {
			for (j=0;j<column;j++ ) {
				matrix_1[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Enter Number Of Rows For Second Matrix: ");
		row = sc.nextInt();
		System.out.println("Enter Number Of Coulmns For Second Matrix : ");
		column = sc.nextInt();

		System.out.println("Enter Elements Of Second Matrix : ");
		for (i=0;i<row;i++ ) {
			for (j=0;j<column;j++ ) {
				matrix_2[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		for (i=0;i<row;i++ ) {
			for (j=0;j<column;j++ ) {
				for (k=0;k<column;k++ ) {
					multiplication[i][j] = multiplication[i][j] + matrix_1[i][k] * matrix_2[k][j];
				}
				System.out.println(multiplication[i][j]+"\t");
			}
			System.out.println();
		}
	}
}