package LinkedList.LoveBabbar;

public class DoublyLL {
	
	static DoublyNode head;
	static DoublyNode tail;
	
	static void printLL(DoublyNode head) {
		while(head!=null) {
			System.out.print("-"+head.data+"-");
			head=head.next;
		}
		System.out.println();
	}
	
	public static void insertAtTop(int data) {
		DoublyNode node = new DoublyNode(data);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		
		node.next = head;
		node.prev = null;
		head.prev = node;
		head = node;
	}
	
	public static void insertAtEnd(int data) {
		DoublyNode node = new DoublyNode(data);
		if(tail == null) {
			head = node;
			tail = node;
			return;
		}
		
		tail.next = node;
		node.prev = tail;
		tail = node;
	}
	
	public static void insertAtPos(int data, int pos) {
		if(head == null || pos<=1) {
			insertAtTop(data);
			return;
		}
		
		int cnt=0;
		DoublyNode temp = head;
		while(temp!=null) {
			cnt++;
			temp=temp.next;
		}
		
		if(pos == cnt+1) {
			insertAtEnd(data);
			return;
		}
		
		if(pos > cnt+1) {
			System.err.println("Position doesnt exist! ");
			return;
		}
		
		DoublyNode node = new DoublyNode(data);
		temp = head; cnt=1;
		while(cnt < pos-1) {
			temp = temp.next;
			cnt++;
		}
		node.next = temp.next;
		temp.next.prev = node;
		temp.next = node;
		node.prev = temp;
	}
	
	static void deleteNode(int pos) {
		if(head == null) {
			System.err.println("LL is empty!");
			return;
		}
		
		if(pos == 1) {
			deleteHead();
			return;
		}
		
		int cnt=0;
		DoublyNode temp = head;
		while(temp!=null) {
			cnt++;
			temp=temp.next;
		}
		
		if(pos == cnt) {
			deleteTail();
			return;
		}
		
		temp=head; cnt=1;
		while(cnt < pos-1) { 
			temp=temp.next;
			cnt++;
		}
		
		temp.next = temp.next.next;
		temp.next.prev = temp;
	}

	private static void deleteTail() {
		DoublyNode prevNode = tail.prev;
		prevNode.next=null;
		tail.prev=null;
		tail = prevNode;		
	}

	private static void deleteHead() {
		DoublyNode nextNode = head.next;
		nextNode.prev = null;
		head.next = null;
		head = nextNode;		
	}

	public static void main(String[] args) {
		DoublyNode temp = new DoublyNode(10);
		head = temp;
		tail = temp;
		printLL(head);
		
		int data = 20;
		System.out.println("Insert at top: "+data);
		insertAtTop(data);
		printLL(head);
		
		data=30;
		System.out.println("Insert at End: "+data);
		insertAtEnd(data);
		printLL(head);
		
		data = 15; int pos=3;
		System.out.println("Insert "+data+" at positon: "+pos);
		insertAtPos(data, pos);
		printLL(head);
		
		//Deleting Node:
		pos = 3;
		System.out.println("Deleting node at position: "+pos);
		deleteNode(pos);
		printLL(head);
	}

}
