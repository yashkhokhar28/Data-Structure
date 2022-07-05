import java.util.*;
class DemoFun{
    int [] arr1 = new int[100];
    int top = -1;

    public void push(int n){
        if (top>=99) {
            System.out.println("Stack Overflow");
        }
        else{
            top++;
            arr1[top]=n;
        }
    }
    public int pop(){
        if (top<=-1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr1[top--];
    }
    public void display(){
        if (top<=-1) {
            System.out.println("Stack Underflow");
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(arr1[i]+"  ");
            }
            System.out.println();
        }
    }
}

public class DemoFunction{
    public static void main(String[] args) {
        DemoFun d1 = new DemoFun();
        Scanner sc=new Scanner(System.in);
        while(true){
             System.out.println("\n1.for push\n2.for pop\n3. for Display \n4. for Exit");
             int n=sc.nextInt();
             if(n==1){
                System.out.print("Enter a value for push: ");
                d1.push(sc.nextInt());
             }
             else if (n==2){
                System.out.println("Element popped is: "+d1.pop());
             }
             else if(n==3){
                d1.display();
             }
             else if(n==4){
                break;
             }
        }  
    }
}
