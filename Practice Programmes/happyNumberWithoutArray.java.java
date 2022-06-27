import java.util.Scanner;

public class happyNumberWithoutArray{
	static int calculateHappyNumber(int n){
		
		int sum=0;
		int rem=0;
		int i=0;
		
		while(n>0){
			rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		return sum;
}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number : ");
		int n=sc.nextInt();
		int result=n;

		while(result!=1 && result!=4){
			result=calculateHappyNumber(result);
		}

		if(result==1){
			System.out.println("happy number");
		}
		else{
			System.out.println("not happy number");
		}
	}
}

