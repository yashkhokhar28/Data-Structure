import java.util.*;

public class arrayMatching{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size Of An Array : ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];

		System.out.println("Enter First Number : ");
		int i1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int i2 = sc.nextInt();

		System.out.println("First Number Is : " + i1 + " And Second Number Is : " + i2);

		System.out.println("Enter Element Of An Array : ");
		for (int i=0;i<n;i++ ) {
			System.out.println("Enter arr1["+i+"] Element");
			arr1[i] = sc.nextInt();
		}

		for (int i=0;i<n;i++) {
			System.out.println("Your "+i+" Element Is : "+arr1[i]+" ");
		}
		System.out.println();

		int flag = 0;

		for (int i=0;i<n;i++) {
			if (i1==arr1[i]) {
				flag = 1;
				arr1[i] = i2;
				System.out.println("Matching Element Is : "+i1+" Found At Index : "+i+" And Replaced By : "+i2);
				break;
			}
			if(i1!=arr1[i]){
				flag = 0;
			}
		}

		if (flag==0) {
			System.out.println("Number Is Not Matching");
		}

		if(flag==1){
			System.out.println("New Array");
			for (int i=0;i<n;i++ ) {
			System.out.println("arr1["+i+"]="+arr1[i]);
			}
		}
	}
}