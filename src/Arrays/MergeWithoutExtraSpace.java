package Arrays;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
	
 public static void merge(int arr1[], int arr2[], int n, int m) {
        
	 int i=0;
     int j=0;
        
        while(i<n) {
            if(arr1[i] > arr2[j]) {
                swap(arr1, i, arr2, j);
                int first = arr2[0];
                int k;
                for(k=1; k<m && arr2[k]<first; k++) {
                	arr2[k-1] = arr2[k];
//                    System.out.println(Arrays.toString(arr2));
                }
                arr2[k-1] = first;
            }
            i++;
        }
    }
    
    public static void swap(int[] arr1, int i, int[] arr2, int j) {
        int t = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = t;
        
//        System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));
    }

	public static void main(String[] args) {
//		int[] arr1 = {1, 3, 5, 7};  int[] arr2 = {0, 2, 6, 8, 9};
		int[] arr1 = {1 ,1 ,1 ,2 ,3 ,5 ,7 ,7 ,7 ,9 ,9 ,13 ,13 ,14 ,14 ,17 ,17 ,19 ,20 ,20}; 
		int[] arr2 = {3 ,5 ,7 ,9 ,10 ,12 ,13 ,14 ,20 ,20};
		
		merge(arr1, arr2, arr1.length, arr2.length);
		
		System.out.println("AnsAr1: "+Arrays.toString(arr1));
        System.out.println("AnsAr2: "+Arrays.toString(arr2));

	}

}
