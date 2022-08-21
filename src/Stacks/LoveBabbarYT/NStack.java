package Stacks.LoveBabbarYT;

import java.util.Arrays;

/**
 * https://www.codingninjas.com/codestudio/problems/n-stacks-in-an-array_1164271?leftPanelTab=0
 * << Difficulty : HARD >>
 * @author Deepak Solanki
 *
 */
public class NStack {
    
    int n, s; //n for No. of stacks & s for Size of Array
    int[] arr; // array
    int[] top; // storing top for all stacks(n)
    int[] next; // storing indexes of next elemnt of that stack
    int free; // for storing index of available free space

    // Initialize your data structure.
    public NStack(int N, int S) {
        n = N;
        s = S;
        arr = new int[s];
        top = new int[n];
        next = new int[s];
        free = 0;
        //next array will initially store next availble space
        for(int i=0;i<s-1;i++) {
            next[i] = i+1;
        }
        next[s-1] = -1;
        
        // intially for blank stack top = -1
        Arrays.fill(top,-1);
     }

    // Pushes 'X' into the Mth stack. Returns true if it gets pushed into the stack, and false otherwise.
    public boolean push(int x, int m) {
        //check for overflow
        if(free == -1){
            return false;
        }
        
        //find free index
        int index = free;
        
        //insert element into array
        arr[index] = x;
        
        //update freespot
        free = next[index];
        
        //update next;
        next[index] = top[m-1];
        
        //update top
        top[m-1] = index;
        
        return true;        
    }

    // Pops top element from Mth Stack. Returns -1 if the stack is empty, otherwise returns the popped element.
    public int pop(int m) {
        //check underflow condition
        if(top[m-1] == -1) {
            return -1;
        }
        
        // rest all operations are reverse of push operations
        int index = top[m-1];
        top[m-1] = next[index];
        next[index] = free;
        free = index;
        return arr[index];
    }
}
