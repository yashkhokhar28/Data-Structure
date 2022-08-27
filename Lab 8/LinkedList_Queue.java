//Write a program to implement queue using singly linked list. (Home Work)

import java.util.Scanner;

class Queue {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    public void EnQueue(int n) {
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

    public void Display() {
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

    public void DeQueue() {
        head = head.next;
    }

    public class LinkedList_Queue {
        public static void main(String[] args) {
            Queue queue = new Queue();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("\n1. Enqueue \n2. Dequeue \n3. Display\n4. Exit");
                int operation = sc.nextInt();
                if (operation == 1) {
                    System.out.println("Enter Element For Enqueue : ");
                    int element = sc.nextInt();
                    queue.EnQueue(element);
                }
                if (operation == 2) {
                    queue.DeQueue();
                }
                if (operation == 3) {
                    queue.Display();
                }
                if (operation == 4) {
                    break;
                }
            }
        }
    }
}
