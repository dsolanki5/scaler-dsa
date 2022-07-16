package Arrays;

/*
 * https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
 */
public class KthMax_Gfg {
	
	public static int kthSmallest(int[] arr, int l, int r, int k) {
		
		//solve using min heap, once heap is done
		return -1;
	}

	public static void main(String[] args) {
		
		
		int arr[] = {7 ,10 ,4 ,3 ,20 ,15}; int k=3;
//		int i=0;
//		for(int n : arr) {
//			tm.put(n, i);
//			i++;
//		}
//		System.out.println("== "+tm);
//		System.out.println(tm.firstEntry());
//		System.out.println(tm.firstKey());
//		System.out.println(tm.lastEntry());
//		System.out.println(tm.lastKey());
//		System.out.println(tm.pollFirstEntry());
//		System.out.println(tm.pollLastEntry());
//		System.out.println("--- "+tm);
		
		System.out.println(kthSmallest(arr, 0, 0, k));

	}

	
//	TLE issue : 
//	public static int kthSmallest(int[] arr, int l, int r, int k) 
//    { 
//		int i=0 ,idx=0;
//        int min = Integer.MAX_VALUE;
//        
//        while(i<k) {
//            for(int j=0; j<arr.length; j++) {
//                if(arr[j] < min) {
//                    min = arr[j];
//                    idx=j;
//                }
//            }
//            if(i+1 == k){
//                return min;
//            }
//            arr[idx] = Integer.MAX_VALUE;
//            min = Integer.MAX_VALUE;
//            i++;
//        }
//        
//        return -1;
//    }
}
