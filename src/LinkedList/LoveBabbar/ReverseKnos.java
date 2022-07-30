package LinkedList.LoveBabbar;

import java.util.Collections;
import java.util.LinkedList;

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
	
	static SinglyNode reverseKNos(SinglyNode head2, int K) {
		SinglyNode curr = head2;
		SinglyNode nxt = null;
		SinglyNode prev = null;
		
		int cnt=0;
		while(curr != null && cnt<K) {
			nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
			cnt++;
		}
		
		if(curr != null) {
			head2.next = reverseKNos(curr, K);
		}
		
		return prev;
		
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
		head = reverseKNos(head, K);
		System.out.println(head);
		

	}

}
