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
    public int peep(int i){
        if (top-i+1<=0) {
            System.out.println("Stack Underflow");
        }
            return arr1[top-i+1];
    }
    public int change(int i,int n){
        if (top-i+1<=0) {
            System.out.println("Stack Underflow");
        }
            return arr1[top-i+1] = n;
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
             System.out.println("\n1.for push\n2.for pop\n3.for peep\n4.for change\n5. for Display \n6. for Exit");
             int n=sc.nextInt();
             if(n==1){
                System.out.print("Enter a value for push: ");
                n=sc.nextInt();
                d1.push(n);
             }
             else if (n==2){
                System.out.println("Element popped is: "+d1.pop());
             }
             else if(n==3){
                System.out.print("Enter a value of i for peep: ");
                int i = sc.nextInt();
                d1.peep(i);
             }
             else if (n==4) {
                System.out.print("Enter a value of element you want to change :  ");
                int i = sc.nextInt();
                System.out.print("Enter a value of element you want to replace :  ");
                n=sc.nextInt();
                d1.change(i,n);
             }
             else if (n==5) {
                 d1.display();
             }
             else if (n==6) {
                 break;
             }
        }  
    }
}
