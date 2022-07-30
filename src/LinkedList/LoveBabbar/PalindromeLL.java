package LinkedList.LoveBabbar;

import java.util.ArrayList;
import java.util.List;

/**
 *  https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
 *  
 * @author Deepak Solanki
 *
 * @param <T>
 */

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return ""+data+" - "+next;
		}
}

public class PalindromeLL {
	static Node head;
	static Node tail;
	
	static void insertAtLast(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			tail = temp;
			return;
		}
		Node p = head;
		while(p.next != null) {
			p = p.next;
		}
		p.next = temp;
		tail=temp;
	}
	
	//Function to check whether the list is palindrome.
    static boolean isPalindrome_Approach1(Node head) 
    {
        List<Integer> al = new ArrayList<>();
        Node curr = head;
        
        while(curr != null) {
            al.add(curr.data);
            curr = curr.next;
        }
        
        int n = al.size();
        int s = 0, e=n-1;
         while(s<e) {
             if(al.get(s) != al.get(e)) {
                 return false;
             }
             s++;
             e--;
         }
         return true;
    }
    
    public static Node getMidNode(Node head) {
        Node slow = head;
        Node fast = slow.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
                if(fast != null) {
                    fast = fast.next;
                }
        }
        return slow;
    }
    
    public static Node revList(Node head) {
        Node curr = head;
        Node prev = null;
        
        while(curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        
        return prev;
    }
    
    //Function to check whether the list is palindrome.
    static boolean isPalindrome_Approach2(Node head) 
    {
        if(head == null)
            return true;
        
        if(head.next == null)
            return true;
        
        Node mid = getMidNode(head);
        Node temp = revList(mid.next);
        Node curr = head;
        
        while(temp != null) {
            if(curr.data != temp.data) {
                return false;
            }
            curr = curr.next;
            temp = temp.next;
        }
        
        return true;
    }

	public static void main(String[] args) {
		int data = 0;
//		for(int i=1; i<=5; i++)
//		{
//			data+=10;
//			insertAtLast(data);
//		}
		insertAtLast(1);
		insertAtLast(2);
		insertAtLast(2);
		insertAtLast(1);
		
		System.out.println(head);
		
		//Approach - 1 (Simple: copy LL data in arrayList and apply palindrome logic of array/string)
		//Requires extra space : Space complexity: O(n) || Time : O(n)
//		System.out.println(isPalindrome_Approach1(head));
		
		//Approach - 2 : Space : O(1) || Time : O(n)
		System.out.println(isPalindrome_Approach2(head));

	}

}
