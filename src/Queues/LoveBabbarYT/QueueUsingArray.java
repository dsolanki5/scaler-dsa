package Queues.LoveBabbarYT;

public class QueueUsingArray {
	
	private static final int SIZE = 10001;
    private int[] arr;
    private int front;
    private int rear;

    QueueUsingArray() {
        arr = new int[SIZE];
        front = 0;
        rear = 0;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        return front == rear;
    }

    void enqueue(int data) {
        if(rear == SIZE)
            return;
        
        arr[rear] = data;
        rear++;
    }

    int dequeue() {
        if(front == rear)
            return -1;
        
        int n = arr[front];
        front++;
        
        if(rear != SIZE && front == rear) {
            front = 0;
            rear = 0;
        }
        
        return n;
    }

    int front() {
        if(front == rear) {
            return -1;
        }
        else {
            return arr[front];
        }
    }

	public static void main(String[] args) {
		
	}

}
