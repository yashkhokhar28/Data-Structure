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
/*
import java.util.*;
class doubly_linkedlist{
	public static void main(String[] args){
		doublyList dl=new doublyList();
		
		Scanner sc=new Scanner(System.in);

		while(true){
			System.out.print("1 for insert\n2 for dlt\n3 for display\n4 for display reverse list\n5 for insert at first\n6 for dlt from front\n7 for dlt By Index\noption: ");
			int op=sc.nextInt();

			switch(op){
				case 1:
					System.out.print("enter element to be inserted: ");
					int n=sc.nextInt();
					dl.insert(n);
					break;

				case 2:
					System.out.println("dleted element: "+dl.dlt());
					break;

				case 3:
					dl.display();
					break;

				case 4:
					dl.displayReverseLink();
					break;
				case 5:
					System.out.print("enter element to be inserted: ");
					int a=sc.nextInt();
					dl.insertAtFirst(a);
					break;

				case 6:
					System.out.println("deleted element: "+dl.dltFront());
					System.out.println();
					break;

				case 7:
					System.out.print("enter index of node to be deleted: ");
					int i=sc.nextInt();
					System.out.println("deleted element: "+dl.dltByIndex(i));
					System.out.println();
					break;
			}
		}
	}
}
class doublyList{
	Node head,last;
	class Node{
		int 	value;
		Node 	next;
		Node 	prev;

		Node(int a){
			value=a;
			next=null;
			prev=null;
		}
	}

	public void insert( int a){
		Node nNode=new Node(a);

		if(head==null){
			head=nNode;
			last=nNode;
		}
		else{
			last.next=nNode;
			nNode.prev=last;
			last=nNode;
		}
	}

	public void insertAtFirst(int a){
		Node nNode=new Node(a);

		if(head==null){
			head=nNode;
			last=nNode;
		}
		else{
			nNode.next=head;
			head=nNode;
		}

	}

	public void displayReverseLink(){
		if(head==null){
			System.out.print("list is empty");
			return;
		}
		else{
			while(last!=null){
				System.out.print("["+last.value+"]");
				last=last.prev;
			}
			System.out.println();
		}
	}

	public void display(){
		Node current=head;
		if(head==null){
			System.out.print("list is empty");
			return;
		}
		else{
			while(current.next!=null){
				System.out.print("["+current.value+"]");
				current=current.next;
			}
			System.out.print("["+current.value+"]");
			System.out.println();
		}
	}

	public int dlt(){
		if(head==null){
			System.out.println("list is empty");
			return -1;
		}
		else{
			last=last.prev;
			last.next=null;
			return last.value;
		}
		
	}

	public int dltFront(){
		if(head==null){
			System.out.println("list is empty");
			return -1;
		}
		else{
			head=head.next;
			return head.prev.value;
		}
	}

	public int dltByIndex(int i){
		Node cNode=head,pNode=null;
		if(head==null){
			System.out.println("list is empty");
			return -1;
		}
		else{
			int count=1;
			while(cNode.next!=null){
				pNode=cNode;
				cNode=cNode.next;
				count++;

				if(count==i){
					pNode.next=cNode.next;
				}
			}
			return pNode.value;		
		}

	}
}*/