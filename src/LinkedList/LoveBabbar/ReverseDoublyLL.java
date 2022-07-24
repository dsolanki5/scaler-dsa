package LinkedList.LoveBabbar;

public class ReverseDoublyLL {
	
	static DoublyNode head;
	static DoublyNode tail;
	
	static void printLL(DoublyNode head) {
		while(head!=null) {
			System.out.print("-"+head.data+"-");
			head=head.next;
		}
		System.out.println();
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
	
	public static void reverseUsingIteration() {
		DoublyNode curr = head;
		
		while(curr != null) {
			DoublyNode nxtNode = curr.next;
			curr.next = curr.prev;
			curr.prev = nxtNode;
			head = curr;
			curr = nxtNode;
		}
	}
	
	public static void reverseUsingRecursion1(DoublyNode curr, DoublyNode prev) {
		if(curr == null) {
			head = prev;
			return;
		}
		
		DoublyNode nxt = curr.next;
		reverseUsingRecursion1(nxt, curr);
		curr.prev = nxt;
		curr.next = prev;
	}
	
	public static DoublyNode reverseUsingRecursion2(DoublyNode head2) {
		if(head2 == null || head2.next == null) {
			return head2;
		}
		
		DoublyNode revHead = reverseUsingRecursion2(head2.next);
		head2.next.prev = head2.next.next;
		head2.next.next = head2;
		head2.next = null;
		
		return revHead;
	}

	public static void main(String[] args) {
		int data = 10;
		DoublyNode temp = new DoublyNode(data);
		head = temp;
		tail = temp;
		
		for(int i=2; i<=5; i++)
		{
			data+=10;
			insertAtEnd(data);
		}
		printLL(head);
		
		// Reverse Iteration technique:
//		reverseUsingIteration();
//		printLL(head);
		
		// Reverse using Recursion technique:		
		DoublyNode curr = head;
//		reverseUsingRecursion1(curr, curr.prev);
//		printLL(head);
		
		// Reverse using another recursion technique:		
		head = reverseUsingRecursion2(curr);
		printLL(head);
		
		
	}

}
