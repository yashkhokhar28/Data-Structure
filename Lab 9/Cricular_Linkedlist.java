import java.util.*;

class List {
    Node head;
    Node currentNode;

    static class Node {
        int data;
        Node next;

        Node(int a) {
            data = a;
            next = null;
        }
    }

    public void insert(int a) {
        Node node = new Node(a);

        if (head == null) {
            currentNode = head = node;
            return;
        }

        currentNode.next = node;
        currentNode = node;
        currentNode.next = head;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty Linked List !!");
            return;
        }
        if (head == currentNode) {
            System.out.print(head.data + " -> ");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
    }

    public void insertFirst(int a) {
        Node node = new Node(a);
        if (head == null) {
            currentNode = head = node;
            return;
        }
        node.next = head;
        head = node;
        currentNode.next = head;
    }

    public int deleteFromFront() {
        int delete = head.data;
        if (head == currentNode) {
            head = currentNode = null;
            return delete;
        }
        head = head.next;
        currentNode.next = head;
        return delete;
    }

    public int deleteByIndex(int i) {
        if (i == 0) {
            return deleteFromFront();
        }
        Node prev = null, tail = head;
        int count = 0;
        while (count != i) {
            prev = tail;
            tail = tail.next;
            count++;
            if (tail == head) {
                System.out.println("Index out of bounds");
                return -1;
            }
        }
        prev.next = tail.next;
        return tail.data;
    }
}

class Cricular_Linkedlist {
    public static void main(String[] args) {
        List li = new List();

        Scanner sc = new Scanner(System.in);
        List obj1 = new List();
        while (true) {
            System.out.print("\n1. Insert \n2. Insert At First \n3. Delete From Front \n4. Delete By Index \n5. Display \n6. Exit\nYour Choice:  ");
            int operation = sc.nextInt();

            if (operation == 1) {
                System.out.print("Enter Element For Insert : ");
                int element1 = sc.nextInt();
                li.insert(element1);
            }
            if (operation == 2) {
                System.out.print("Enter Number To Be Inserted At First Position: ");
                int element2 = sc.nextInt();
                li.insertFirst(element2);
            }
            if (operation == 3) {
                System.out.println("Deleted Element From Front Is: " + li.deleteFromFront());
            }
            if (operation == 4) {
                System.out.print("Enter Postion Of Element: ");
                int element3 = sc.nextInt();
                li.deleteByIndex(element3);
            }
            if (operation == 5) {
                li.display();
            }
            if (operation == 6) {
                break;
            }
        }
    }
}
