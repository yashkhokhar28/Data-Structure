import java.util.*;

class CheckValidString{
	static int top = -1;
	static int a = 0;
	static int b = 0;
	static char[] arr1 = new char[100]; 
	public static void push(char n){
		if (top>=99) {
			System.out.println("Stack Overflow");
		}
		else{
			top++;
			 arr1[top] = n;
		}
	}
	public static char pop(){
		if (top<0) {
			System.out.println("Stack Underflow");
		}
			char s = arr1[top];
			top--;
			return s;		
	}
	public static void powerofAandB(int l){
		for (int i=0;i<l;i++ ) {
			char s = pop();
			if (s=='a') {
				a++;			
			}
			if (s=='b') {
				b++;
			}			
		}
		if (a==b) {
			System.out.println("Equal Power");
		}
		else{
			System.out.println("Not Equal Power");
		}
	}
}


public class ValidString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CheckValidString c1 = new CheckValidString();
		System.out.println("Enter A String : ");
		String str1 = sc.next();
		int l = str1.length();
		for (int i=0;i<l;i++ ) {
			c1.push(str1.charAt(i));
		}
		c1.powerofAandB(l);
	}
}