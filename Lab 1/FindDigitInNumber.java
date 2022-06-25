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
		Scanner sc = new Scanner(System.in);
		int a;
		int n = sc.nextInt();
		a = countDigit(n);
		System.out.println(a);
	}
}