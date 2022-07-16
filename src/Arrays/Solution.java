package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Solution 
{
    public static int[] sort012(int[] arr)
    {
        int ptr1 = 0, i=0;
        int ptr2 = arr.length-1;
        
        while(i<=ptr2) {
            
            while(arr[ptr1] == 0 && ptr1 < ptr2){
                ptr1++;
                i++;
            }
            
            while(i<=ptr2 && arr[ptr2] == 2){
                ptr2--;
            }
            
            if(arr[ptr1] > arr[ptr2]) {
                int temp = arr[ptr2];
                arr[ptr2] = arr[ptr1];
                arr[ptr1] = temp;
//                if(arr[ptr1] == 0)
                	ptr1++;
            }
            
            if(ptr1 < ptr2 && arr[i] < arr[ptr1]) {
                int temp = arr[ptr1];
                arr[ptr1] = arr[i];
                arr[i] = temp;
                if(arr[ptr1] == 0)
                	ptr1++;
                else
                	continue;
            }
            
            if(i<ptr2 && arr[i] > arr[ptr2]) {
                int temp = arr[ptr2];
                arr[ptr2] = arr[i];
                arr[i] = temp;
                if(arr[ptr2] == 2)
                	ptr2--;
            }
            i++;
        }
        HashSet<Integer> hs = new HashSet<Integer>();
        
        return arr;
    }
    
    public static void main(String[] args) {
//		int[] arr = {1 ,1 ,1 ,1 ,1 ,1 ,1 ,1 ,1,1};
//		int[] arr = {2 ,2 ,2 ,2, 2 ,2 ,2 ,2 ,2 ,2};
//    	int[] arr = {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0};
//    	int[] arr = {1 ,0 ,1 ,0, 1 ,0 ,1 ,0 ,1 ,0};
//    	int[] arr = {1 ,2 ,2 ,1 ,1 ,2 ,2 ,1 ,1 ,2};
//    	int[] arr = {0 ,1 ,2 ,0 ,1 ,2, 0 ,1 ,2 ,0};
//    	int[] arr = {0 ,1 ,2 ,1 ,2 ,1 ,2};
//    	int[] arr = {0 ,1 ,2 ,2 ,1 ,0};
//    	int[] arr = {2 ,2 ,1 ,1 ,2 ,2 ,2 ,2 ,2 ,2};
    	int[] arr = {0 ,2 ,1 ,0 ,2 ,1 ,0 ,2 ,1 ,2};
		System.out.println(Arrays.toString(sort012(arr)));
	}
}
