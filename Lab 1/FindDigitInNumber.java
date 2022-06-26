import java.util.*;

public class FindDigitInNumber{
	public static int countDigit(int n){
		int count = 0;
		if (n==0) {
			return count;
		}
		else{
			return 1+countDigit(n/10);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter A Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==0) {
			System.out.println("Digits In Number Is : 1");
		}
		else{
			int a;
			a = countDigit(n);
			System.out.println("Digits In Number Is : "+a);
		}
	}
}
