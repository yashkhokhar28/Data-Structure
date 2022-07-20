import java.util.Scanner;

public class SimpleQueue {
    int[] arr1 = new int[100];
    int front = -1;
    int rear = -1;

    public void enQueue(int n) {
        if (rear >= 99) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            if (rear == 0) {
                front = 0;
            }
            arr1[rear] = n;
        }
    }

    public int deQueue() {
        if (front < 0) {
            System.out.println("Queue Undeflow");
        }
        return arr1[front++];
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.println("[" + arr1[i] + "] ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleQueue s1 = new SimpleQueue();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.for enQueue\n2.for deQueue\n3.for Display\n4.for Exit");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.print("Enter a value for enQueue: ");
                n = sc.nextInt();
                s1.enQueue(n);
            } else if (n == 2) {
                System.out.println("Element deQueued is: " + s1.deQueue());
            } else if (n == 3) {
                s1.display();
            } else if (n == 4) {
                break;
            }
        }
    }
}
