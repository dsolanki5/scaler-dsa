package Queues.LoveBabbarYT;

/**
 * https://www.codingninjas.com/codestudio/problems/deque_1170059?leftPanelTab=0
 * 
 * @author Deepak Solanki
 *
 */
public class Deque 
{
    int front;
    int rear;
    int size;
    int[] arr;
    // Initialize your data structure.
    public Deque(int n) 
    {
        size = n;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        if(isFull()) {
            return false;
        }
        //no elemnt and push 1st elemnt
        else if(front == -1) { 
            front = 0;
            rear = 0;
        }
        //as it follows circular approach ...
        //when front reaches start index after that push has to 
        // happen from end hence we check if there is 
        // no elemnt at rear
        else if(front == 0 && rear != size-1) {
            front = size-1;
        }
        // normally every PushFront happens at front
        else {
            front --;
        }
        
        arr[front] = x;
        return true;
    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        if(isFull()) {
            return false;
        }
        else if(rear == -1) {
            front = 0;
            rear = 0;
        }
        else if(rear == size-1 && front != 0) {
            rear = 0;
        }
        else {
            rear++;
        }
        arr[rear] = x;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        if(isEmpty()) {
            return -1;
        }
        int x = arr[front];
        arr[front] = -1;
        
        if(front == rear) {
            front = -1;
            rear = -1;
        }
        else if(front == size-1) {
            front = 0;
        }
        else {
            front++;
        }
        
        return x;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        if(isEmpty()) {
            return -1;
        }
        int x = arr[rear];
        arr[rear] = -1;
        
        if(front == rear) {
            front = -1;
            rear = -1;
        }
        else if(rear == 0) {
            rear = size-1;
        }
        else {
            rear-- ;
        }
        return x;        
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        if(isEmpty()) {
            return -1;
        }
        
        return arr[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        if(isEmpty()) {
            return -1;
        }
        
        return arr[rear];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        return front == -1;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        if((front == 0 && rear == size-1) || (front !=0 && rear == front-1)) {
            return true;
        }
        else {
            return false;
        }
    }
}
