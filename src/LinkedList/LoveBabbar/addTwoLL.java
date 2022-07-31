package LinkedList.LoveBabbar;

public class addTwoLL {
	
	static Node head1;
	static Node tail1;
	
	static Node head2;
	static Node tail2;
	
	static Node insertAtLast(Node headref, Node tailref, int data) {
		Node temp = new Node(data);
		if(headref == null) {
			headref = temp;
			tailref = temp;
			
		}
		else {
			Node p = headref;
			while(p.next != null) {
				p = p.next;
			}
			p.next = temp;
		}
		return headref;
//		Node p = head;
//		while(p.next != null) {
//			p = p.next;
//		}
//		p.next = temp;
//		tail=temp;
	}	
	
	//reverse 
    static Node reverseLL(Node head) {
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
    
    // static void insertAtTail(int data) {
    //     Node newNode = new Node(data);
    //     if(ansHead == null) {
    //         ansHead = newNode;
    //         ansTail = newNode;
    //     }
    //     else {
    //         ansTail.next = newNode;
    //         ansTail = newNode;
    //     }
    // }
    
    //Adding two Linked List 
    public static Node addTwoLL(Node first, Node second) {
        int carry=0;
    Node ansHead = null;
    Node ansTail = null;
        
        while(first != null || second != null || carry != 0) {
            int sum = 0;
            if(first != null) {
                sum += first.data;
            }
            if(second != null) {
                sum += second.data;
            }
            
            sum += carry;
            
            int digit = sum%10;
            //
            // insertAtTail(digit);
            Node newNode = new Node(digit);
            if(ansHead == null) {
                ansHead = newNode;
                ansTail = newNode;
            }
            else {
                ansTail.next = newNode;
                ansTail = newNode;
            }
            
            carry = sum/10;
            
            if(first != null) {
                first = first.next;
            }
            if(second != null) {
                second = second.next;
            }
        }
        
        if(ansHead != null)
        {
            ansHead = reverseLL(ansHead);
        }
        
        return ansHead;
    }
    
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        if(first == null) {
            return second;
        }
        if(second == null) {
            return first;
        }
        
        first = reverseLL(first);
        second = reverseLL(second);
        
        return addTwoLL(first, second);
    }

	public static void main(String[] args) {
		
		head1 = insertAtLast(head1, tail1, 4);
		head1 = insertAtLast(head1, tail1, 5);
			System.out.println(head1);
			
		head2 = insertAtLast(head2, tail2, 3);
		head2 = insertAtLast(head2, tail2, 4);
		head2 = insertAtLast(head2, tail2, 5);
			System.out.println(head2);
		
		
		System.out.println("Ans: "+addTwoLists(head1, head2));

	}

}
