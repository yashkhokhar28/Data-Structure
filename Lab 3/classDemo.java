/*Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5
students, scan their information and print it.
*/
import java.util.*;


class Student_Detail{
	int n = 5;
	int[] Enrollment_no = new int[n];
	String[] Name = new String[n];
	int[] Sem = new int[n];
	double[] CPI = new double[n];

	Scanner sc = new Scanner(System.in);

	void getDetails(){
		for (int i=0;i<n;i++ ) {
		System.out.println("Enter "+i+" Enrollment Number : ");
		Enrollment_no[i] = sc.nextInt();
		System.out.println("Enter "+i+" Name : ");
		Name[i] = sc.next();
		System.out.println("Enter "+i+" Sem : ");
		Sem[i] = sc.nextInt();
		System.out.println("Enter "+i+" CPT : ");
		CPI[i] = sc.nextDouble();
		}
		for (int i=0;i<n;i++ ) {
			System.out.println("Enrollment Is : "+Enrollment_no[i]);
			System.out.println("Name Is : "+Name[i]);
			System.out.println("Sem Is : "+Sem[i]);
			System.out.println("CPI Is : "+CPI[i]);
		}
	}
}
public class classDemo{
	public static void main(String[] args) {
		Student_Detail s1 = new Student_Detail();
		s1.getDetails();
	}
}