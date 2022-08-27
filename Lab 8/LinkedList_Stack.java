//Write a program to implement stack using singly linked list. (Home Work)

import java.util.Scanner;

class stack {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    public void push(int n) {
        Node node = new Node(n);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public int pop() {
        Node temp = head;
        Node tail = null;
        if (head == null && tail == null) {
            System.out.println("Empty Linked List !!");
            return 0;
        } else {
            while (temp.next != null) {
                tail = temp;
                temp = temp.next;
            }
            tail.next = null;
            return tail.data;
        }
    }

    public int peek() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty Linked List !!");
            return 0;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }

            return temp.data;
        }
    }

    public void peep(int i) {
        Node temp = head;
        int count = 1;
        if (head == null) {
            System.out.println("Empty Linked List !!");
            return;
        } else {

            while (temp.next != null) {
                count++;
            }
            int[] arr = new int[count];
            for (int j = 0; j < count; j++) {
                arr[j] = temp.data;
            }
        }
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty Linked List !!");
            return;
        } else {
            System.out.print("Nodes of linked list: ");
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data + " -> ");

        }
    }

}

public class LinkedList_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack stck = new stack();
        while (true) {
            System.out.println("\n1. Push \n2. Pop \n3. Peek \n4. Peep\n5. Display\n6. Exit");
            int operation = sc.nextInt();
            if (operation == 1) {
                System.out.println("Enter A Element For Push : ");
                int x = sc.nextInt();
                stck.push(x);
            }
            if (operation == 2) {
                stck.pop();

            }
            if (operation == 3) {
                System.out.println("Top Element Of Stack Is : " + stck.peek());

            }
            if (operation == 4) {
                System.out.println("Enter I'th Element Which You Want To Display : ");
                int i = sc.nextInt();
                stck.peep(i);
            }
            if (operation == 5) {
                stck.display();
            }
            if (operation == 6) {
                break;
            }
        }
    }
}
