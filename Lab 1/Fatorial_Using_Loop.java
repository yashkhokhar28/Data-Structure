import java.util.Scanner;

public class Fatorial_Using_Loop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int n = sc.nextInt();
		for (int i=1;i<=n ;i++ ) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
