import java.util.*;
class circlar_linkedlist{
	public static void main(String[] args){
		list l=new list();
		
		Scanner sc=new Scanner(System.in);
		list obj1=new list();
		int x;
		while(true){
			System.out.print("Enter 1 for insert \nEnter 2 for insert at first \nEnter 3 for delete from front \nEnter 4 for delete by index \nEnter 5 for display \nchoice:  ");
			int op=sc.nextInt();

			switch(op){
				case 1:
					System.out.print("enter number to be inserted: ");
					x=sc.nextInt();
					l.insert(x);
					break;

				case 2:
					System.out.print("enter number to be inserted at first position: ");
					x=sc.nextInt();
					l.insert_At_First(x);
					break;

				case 3:
					System.out.println("deleted element from front is: "+l.deleteFromFront());
					break;

				case 4:
					System.out.print("enter postion of element: ");
					x=sc.nextInt();
					l.deleteByIndex(x);
					break;

				case 5:
					l.display();
			}

		}
	}
}
class list{
	Node head;
	Node currentNode;
	static class Node{
		int value;
		Node next;

		Node(int a){
			value=a;
			next=null;
		}
	}

	public void insert(int a){
		Node nNode=new Node(a);
		
		if(head==null){
			currentNode=head=nNode;
			return;
		}
		
		currentNode.next=nNode;
		currentNode=nNode;
		currentNode.next=head;
	}

	public void display(){
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		if(head==currentNode){
			System.out.print("["+head.value+"]");
			return;
		}
		Node tail=head;
		do{
			System.out.print("["+tail.value+"] ");
			tail = tail.next; 
		}while(tail!=head);
		System.out.println();
	}

	public void insert_At_First(int a){
		Node nNode=new Node(a);
		if(head==null){
			currentNode=head=nNode;
			return;
		}
		nNode.next=head;
		head=nNode;
		currentNode.next=head;
	}

	public int deleteFromFront(){
		int dlt=head.value;
		if(head==currentNode){
			head=currentNode=null;
			return dlt;
		}
		head=head.next;
		currentNode.next=head;
		return dlt;
	}

	public int deleteByIndex(int i){
		if(i==0){
			return deleteFromFront();
		}
		Node prev=null,tail=head;
		int count=0;
		while(count!=i){
			prev=tail;
			tail=tail.next;
			count++;
			if(tail==head){
				System.out.println("Index out of bounds");	
				return -1;
			}
		}
		prev.next=tail.next;
		return tail.value;
	}
}