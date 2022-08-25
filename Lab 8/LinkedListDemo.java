/*Write a menu-driven program to implement following operations on the singly linked list.
        a. Insert a node at the front of the linked list.
        b. Display all nodes.
        c. Delete a first node of the linked list.
        d. Insert a node at the end of the linked list. (Homework)
        e. Delete a last node of the linked list. (Homework)
        f. Delete a node from specified position. (Home Work)*/

import java.util.Scanner;

class LL {
    static Node head;
    static int count = 0;

    static class Node {
        int data;
        Node next;

        public Node(int a) {
            data = a;
            next = null;
        }
    }

    public static void InsertFirst(int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;

        count++;
    }

    public static void InsertLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            count++;
        }
    }

    public static void DeleteFirst() {
        if (head == null) {
            System.out.println("List Is Empty !!");
        } else {
            head = head.next;
            count--;
        }
    }

    public static void DeleteLast() {
        if (head == null) {
            System.out.println("List Is Empty !!");
        } else {
            count--;
            if (head.next == null) {
                head = null;
            }
            Node secondLast = head;
            Node lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next = null;
        }
    }

    public static void Display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List Is Empty !!");
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Number Of Element In This Linked List Is : " + count);
    }

    public static void DeleteByIndex(int position) {
        if (position < 1) {
            System.out.print("\nIndex Should Be >= 1.");
        } else if (position == 1 && head != null) {
            Node node = head;
            head = head.next;
            node = null;
        } else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                }
            }
            if (temp != null && temp.next != null) {
                Node node = temp.next;
                temp.next = temp.next.next;
                node = null;
            } else {

                System.out.print("\nThe node is already Empty !!.");
            }
        }
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LL l1 = new LL();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Insert a node at the front of the linked list." + "\n2. Insert a node at the end of the linked list." + "\n3. Delete a first node of the linked list." + "\n4. Delete a last node of the linked list. " + "\n5. Delete a node from specified position. " + "\n6. Display all nodes." + "\n7. Exit");
            int cases = sc.nextInt();
            switch (cases) {
                case 1:
                    System.out.println("Enter The Element You Want To Insert : ");
                    int element1 = sc.nextInt();
                    l1.InsertFirst(element1);
                    break;
                case 2:
                    System.out.println("Enter The Element You Want To Insert : ");
                    int element2 = sc.nextInt();
                    l1.InsertLast(element2);
                    break;
                case 3:
                    l1.DeleteFirst();
                    break;
                case 4:
                    l1.DeleteLast();
                    break;
                case 5:
                    System.out.println("Enter Index For Delete Operation : ");
                    int position = sc.nextInt();
                    l1.DeleteByIndex(position);
                    break;
                case 6:
                    l1.Display();
                case 7:
                    break;
            }
        }
    }
}
