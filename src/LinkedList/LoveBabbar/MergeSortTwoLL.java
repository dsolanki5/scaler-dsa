package LinkedList.LoveBabbar;

/**
 * https://www.codingninjas.com/codestudio/problems/merge-two-sorted-linked-lists_800332?leftPanelTab=0
 * @author Deepak Solanki
 *
 * @param <T>
 */
/********************************************************************

Following is the representation of the Singly Linked List NodeMS:



********************************************************************/

class NodeMS<T> {
    T data;
    NodeMS<T> next;
    
    public NodeMS(T data) {
        this.data = data;
    }
}

public class MergeSortTwoLL {
	
	public static NodeMS<Integer> getMid(NodeMS<Integer> head) {
	    NodeMS<Integer> slow = head;
	    NodeMS<Integer> fast = head.next;
	    
	    while(fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	        
//	         if(fast != null) {
//	             fast = fast.next;
//	         }
	    }
	    return slow;
	}
	public static NodeMS<Integer> mergeSort(NodeMS<Integer> head) {
	    if(head == null){
	        return head;
	    }
	    if(head.next == null) {
	        return head;
	    }
	    
	    NodeMS<Integer> left = head;
	    NodeMS<Integer> mid = getMid(head);
	    NodeMS<Integer> right = mid.next;
	    mid.next = null;
	    
	    left = mergeSort(left);
	    right = mergeSort(right);
	    
	    NodeMS<Integer> res = merge(left,right);
	    
	    return res;
	}

	public static NodeMS<Integer> merge(NodeMS<Integer> left, NodeMS<Integer> right) {
	    if(left == null) {
	        return right;
	    }
	    if(right == null) {
	        return left;
	    }
	    
	    if(left.data < right.data) {
	        return solveMerge(left, right);
	    }
	    else {
	        return solveMerge(right, left);
	    }
	}

	//alternate logic(in C++) for merge algorithm is under this method 
	public static NodeMS<Integer> solveMerge(NodeMS<Integer> left, NodeMS<Integer> right) {
	    if(left.next == null) {
	        left.next = right;
	        return left;
	    }
	    
	    NodeMS<Integer> curr1 = left;
	    NodeMS<Integer> nxt1 = curr1.next;
	    NodeMS<Integer> curr2 = right;
	    
	    while(nxt1 != null && curr2 != null) {
	        if(curr2.data >= curr1.data && curr2.data <= nxt1.data) {
	            NodeMS<Integer> nxt2 = curr2.next;
	            curr1.next = curr2;
	            curr2.next = nxt1;
	            curr1 = curr2;
	            curr2 = nxt2;
	        }
	        else {
	            curr1 = nxt1;
	            nxt1 = nxt1.next;
//	             curr2 = curr2.next;
	        }
	        
	        if(nxt1 == null) {
	            curr1.next = curr2;
	            return left;
	        }
	    }
	    
	    return left;
	    
	}
	
	/*
	 * Alternate Merge algorithm :
	 * 
	 */
//	NodeMS* merge(NodeMS* left, NodeMS* right) {
//	    
//	    if(left == NULL)
//	        return right;
//	    
//	    if(right == NULL)
//	        return left;
//	    
//	    NodeMS* ans = new NodeMS(-1);
//	    NodeMS* temp = ans;
//	    
//	    //merge 2 sorted Linked List
//	    while(left != NULL && right != NULL) {
//	        if(left -> data < right -> data ) {
//	            temp -> next = left;
//	            temp = left;
//	            left = left -> next;
//	        }
//	        else
//	        {
//	            temp -> next = right;
//	            temp = right;
//	            right = right -> next;
//	        }
//	    }
//	    
//	    while(left != NULL) {
//	        temp -> next = left;
//	        temp = left;
//	        left = left -> next;
//	    }
//	    
//	    while(right != NULL) {
//	        temp -> next = right;
//	        temp = right;
//	        right = right -> next;
//	    }
//	    
//	    ans = ans -> next;
//	    return ans;
//	    
//	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
