package LinkedList.LoveBabbar;

import java.util.HashMap;
import java.util.Map;

public class CloneLL {
	
	class Node {
	    int data;
	    Node next, arb;

	    Node(int d) 
	    { 
	        data = d;
	        next = arb = null; 
	        
	    }
	}
	///////////////////////////////////
	
	//Function to clone a linked list with next and random pointer.
    Node copyListUsingMap(Node head) {
    	if(head == null) {
            return null;
        }
        
        if(head.next == null) {
            return head;
        }
        
        Node cloneHead = new Node(-1);
        
        Node temp = head;
        Node temp2 = cloneHead;
        Map<Node, Node> orgToCloneMap = new HashMap<>();
        
        while(temp != null) {
            Node newNode = new Node(temp.data);
            temp2.next = newNode;
            temp2 = newNode;
            orgToCloneMap.put(temp, temp2);
            
            temp = temp.next;
        }
        
        temp = head;
        temp2 = cloneHead.next;
        while(temp != null) {
            temp2.arb = orgToCloneMap.get(temp.arb);
            
            temp = temp.next;
            temp2 = temp2.next;
        }
        
        return cloneHead.next;
    }
    
  //Function to clone a linked list with next and random pointer.
    // Without extra space
    Node copyList(Node head) {
        
        //create clone list
        Node cloneHead = new Node(-1);
        Node clonen = cloneHead;
        
        Node orgn = head;
        while(orgn != null) {
            Node newNode = new Node(orgn.data);
            clonen.next = newNode;
            clonen = newNode;
            
            orgn = orgn.next;
        }
        
        // clone Nodes add in between org list
        orgn = head;
        clonen = cloneHead.next;
        while(orgn != null) {
            Node nxt = orgn.next;
            orgn.next = clonen;
            orgn = nxt;
            
            nxt = clonen.next;
            clonen.next = orgn;
            clonen = nxt;
        }
        
        // random pointer copy
        orgn = head;
        clonen = cloneHead.next;
        while(orgn != null && clonen != null) {
            if(orgn.arb != null) {
                clonen.arb = orgn.arb.next;
            }
            else {
                clonen.arb = null;
            }
            
            orgn = orgn.next;
            if(orgn != null) {
                orgn = orgn.next;
            }
            
            clonen = clonen.next;
            if(clonen != null) {
                clonen = clonen.next;
            }
        }
        
        // revert
        orgn = head;
        clonen = cloneHead.next;
        while(orgn != null && clonen != null) {
            orgn.next = clonen.next;
            orgn = orgn.next;
            
            if(orgn != null) {
                clonen.next = orgn.next;
            }
            clonen = clonen.next;
        }
        
        //return ans;
        return cloneHead.next;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
