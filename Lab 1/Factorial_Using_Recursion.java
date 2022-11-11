import java.util.Scanner;

public class Factorial_Using_Recursion{
	public static int calculateFactor(int n){
		if (n==0) {
			return 1;
		}
		else{
			return n*calculateFactor(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int n = sc.nextInt();
		fact = calculateFactor(n);
		System.out.println(fact);
	}
}
