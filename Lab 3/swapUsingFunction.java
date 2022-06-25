import java.util.*;


class swaping{

	public void swap(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value Of a : ");
		int a = sc.nextInt();
		System.out.println("Enter Value Of b : ");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Value Of a After Replacement Is : "+ a +" And Value Of b After Replacement Is : "+b);
	}
}
public class swapUsingFunction{
	public static void main(String[] args) {
		swaping s1 = new swaping();
		s1.swap();
	}
}