package LinkedList.LoveBabbar;

public class ReverseKnos {
	
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
	
	static void reverseKNos(int K) {
		SinglyNode curr = head;
		SinglyNode prev = curr;
		SinglyNode start = null;
		
		while(curr != null) {
			
			int cnt = 1;
			while(cnt < K && curr!= null) {
				curr = curr.next;
				cnt++;
			}
			
			while(curr != null && prev != curr) {
				SinglyNode temp = prev.next;
				prev.next = start;
				start = prev;
				prev = temp;
			}
			curr = curr.next;
			prev.next = start;
			start = prev;
			
			prev = curr;			
		}
		
//		prev.next = start;
		head = prev;
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
		
		int K=2;
		reverseKNos(K);
		System.out.println(head);
		

	}

}
