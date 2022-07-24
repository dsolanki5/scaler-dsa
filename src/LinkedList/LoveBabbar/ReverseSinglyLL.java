package LinkedList.LoveBabbar;

public class ReverseSinglyLL {
	static SinglyNode head;
	static SinglyNode tail;
	
	static void insertAtLast(int data) {
		SinglyNode temp = new SinglyNode(data);
		SinglyNode p = head;
		while(p.next != null) {
			p = p.next;
		}
		p.next = temp;
		tail=temp;
	}
	
	public static void reverseIteration() {
		if(head == null) {
			System.err.println("Linked List is empty!");
			return;
		}
		
		SinglyNode curr = head;
		SinglyNode prev = null;
		while(curr != null) {
			SinglyNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head = prev;
	}
	
	public static void reverseRecursion1() {
		if(head == null) {
			System.err.println("Linked List is empty!");
			return;
		}
		
		SinglyNode curr = head;
		SinglyNode prev = null;
		solve1(curr, prev);
	}
	
	private static void solve1(SinglyNode curr, SinglyNode prev) {

		if(curr == null) {
			head = prev;
			return;
		}
		
		SinglyNode forward = curr.next;
		solve1(forward, curr);
		curr.next = prev;
		
	}
	
	public static void reverseRecursion2( ) {
		head = solve2(head);
	}

	private static SinglyNode solve2(SinglyNode head2) {
		if(head2 == null || head2.next == null) {
			return head2;
		}
		
		SinglyNode revHead = solve2(head2.next);
		head2.next.next = head2;
		head2.next = null;
		
		return revHead;
	}

	public static void main(String[] args) {
		int data = 10;
		SinglyNode temp = new SinglyNode(data);
		head = temp;
		tail=temp;
		
		for(int i=2; i<=5; i++)
		{
			data+=10;
			insertAtLast(data);
		}
		
		System.out.println(head);
		
//		reverseIteration();
//		System.out.println(head);
		
//		reverseRecursion1();
//		System.out.println(head);
		
		reverseRecursion2();
		System.out.println(head);
		
	}

}
