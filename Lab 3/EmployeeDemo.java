/*Create class Employee_Detail with attributes Employee_id, Name, Designation, and Salary. Write a
program to read the detail from user and print it
*/

import java.util.*;

class Employee_Detail{
	int Employee_id;
	String Name;
	String Designation;
	double Salary;

	Scanner sc = new Scanner(System.in);

	void readDetails(){
		System.out.println("Enter Employee_id : ");
		int Employee_id = sc.nextInt();
		System.out.println("Enter Name : ");
		String Name = sc.next();
		System.out.println("Enter Designation : ");
		String Designation = sc.next();
		System.out.println("Enter Salary : ");
		double Salary = sc.nextDouble();
		System.out.println(Employee_id);
		System.out.println(Name);
		System.out.println(Designation);
		System.out.println(Salary);
	}
}


public class EmployeeDemo{
	public static void main(String[] args) {
		Employee_Detail e1 = new Employee_Detail();
		e1.readDetails();
	}
}