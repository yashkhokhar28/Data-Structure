/*Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5
students, scan their information and print it.
*/
import java.util.Scanner;
class Student_Detail{
	long enrollment_no;
	String name;
	int sem;
	double cpi;
	public Student_Detail(long enrollment_no,String name,int sem,double cpi){
		this.enrollment_no=enrollment_no;
		this.name=name;
		this.sem=sem;
		this.cpi=cpi;
	}
	public void printDetails(){
		System.out.println("Enrollment No. : "+enrollment_no);
		System.out.println("Name : "+name);
		System.out.println("Semester : "+sem);
		System.out.println("CPI : "+cpi);
	}
}
public class classDemo{
	public static void main(String[] args) {
		Student_Detail obj[]=new Student_Detail[5];
		obj[0]=new Student_Detail(1106,"yash",3,10);
		obj[1]=new Student_Detail(1105,"krish",4,9);
		obj[2]=new Student_Detail(1104,"deep",5,8);
		obj[3]=new Student_Detail(1103,"jadu",6,7.90);
		obj[4]=new Student_Detail(1102,"mangu",7,9.9);
		for(int i=0;i<5;i++){
			System.out.println("-----Details of student "+(i+1)+"-----");
			obj[i].printDetails();
		}
	}
}
