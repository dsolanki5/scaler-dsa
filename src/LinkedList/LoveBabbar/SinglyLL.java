package LinkedList.LoveBabbar;

public class SinglyLL {
	
	static Node head;
	static Node tail;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		@Override
		public String toString() {
			return ""+data+" - "+next;
		}
	}
	
	static void insertAtFirst(int data) {
		SinglyLL.Node temp = new SinglyLL.Node(data);
		temp.next = head;
		head = temp;
	}
	
	static void insertAtLast(int data) {
		SinglyLL.Node temp = new SinglyLL.Node(data);
		Node p = head;
		while(p.next != null) {
			p = p.next;
		}
		p.next = temp;
		tail=temp;
	}
	
	static void insertAtPos(int data, int pos) throws Exception {
		if(pos==1) {
			insertAtFirst(data);
			return;
		}
		Node temp = head;
		int cnt=1;
		while(cnt < pos-1) {
			temp = temp.next;
			cnt++;
		}
		
		if(temp==null || temp.next == null) {
			System.out.println("inserting at last... ");
			insertAtLast(data);
			return;
		}
		
		SinglyLL.Node nodeToInsert = new Node(data);
		nodeToInsert.next = temp.next;
		temp.next = nodeToInsert;
	}
	
	static void deleteNodeAtPos(int pos) {
		if(pos == 1) {
			head = head.next;
			return;
		}
		
		Node prev = head;
		int cnt=1;
		while(cnt < pos-1) {
			prev=prev.next;
			cnt++;
		}
		
		if(prev.next == null) {
			System.out.println("Node at this position doesnt exist");
			return;
		}
		
		Node nodeToDel = prev.next;
		prev.next = nodeToDel.next;
	}
	

	public static void main(String[] args) throws Exception {
		SinglyLL.Node temp = new SinglyLL.Node(10);
		head = temp;
		tail=temp;
		System.out.println(head);
		
		insertAtLast(20);
		insertAtLast(30);
		System.out.println(head);
		insertAtPos(25, 3);
		System.out.println(head);
		deleteNodeAtPos(3);
		
//		temp = new SinglyLL.Node(20);
//		tail = temp;
//		head.next = tail;
//		
//		System.out.println(head);
//		
//		int data = 30;
//		insertAtFirst(data);
//		System.out.println("After inserting at Head: "+data);
//		System.out.println(head);
//		
//		data = 40;
//		insertAtLast(data);
//		System.out.println("After inserting at Tail: "+data);
//		System.out.println(head);
//		
//		data = 50;
//		insertAtPos(data, 5);
//		System.out.println("Inserting node at given Pos: "+data);
//		System.out.println(head);
//		
//		//Deleting Node : 
//		int pos = 4;
//		System.out.println("deleting from position: "+pos);
//		deleteNodeAtPos(pos);
		System.out.println(head);
//		System.out.println(tail.data);
		

	}

}
