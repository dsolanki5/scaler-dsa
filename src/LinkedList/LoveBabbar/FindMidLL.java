package LinkedList.LoveBabbar;

public class FindMidLL {
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
	
	public static void getMidNode() {
		SinglyNode fast = head.next;
		SinglyNode slow = head;
		
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
			if(fast != null) {
				fast = fast.next;
			}
		}
		
		System.out.println("Middle Node: "+slow.data);
	}

	public static void main(String[] args) {
		int data = 10;
		SinglyNode temp = new SinglyNode(data);
		head = temp;
		tail=temp;
		
		for(int i=2; i<=6; i++)
		{
			data+=10;
			insertAtLast(data);
		}
		
		System.out.println(head);
		
		getMidNode();

	}

}
