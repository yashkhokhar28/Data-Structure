import java.util.*;
class List{
	 Node head;

	 class Node{
		 int data;
		 Node next;
		 Node prev;

		Node(int a){
			data = a;
			next = null;
			prev = null;
		}
	}
		  void insert(int data){
			Node node = new Node(data);
			if (head==null) {
				head = node;
				return;
			}
			Node temp = head;
			while (temp.next!=null) {
				temp=temp.next;
			}
			temp.next=node;
			node.prev=temp;
		}
		  void display(){
			if (head==null) {
				System.out.println("Empty List !!");
			}
			Node temp = head;
			while (temp!=null) {
				System.out.print(temp.data + " -> ");
				temp=temp.next;
			}
		}
	
}
public class DLL{
	public static void main(String[] args) {
		List li = new List();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n1. insert\n2.display\n3. exit");
			int op = sc.nextInt();
			if (op==1) {
				System.out.println("Enter a element for insert : ");
				int element = sc.nextInt();
				li.insert(element);
			}
			else if (op==2) {
				li.display();
			}
			else if (op==3) {
				break;
			}
		}
	}
}
