package BinarySearch;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
public class PeakIndexInMountainArr {

    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while(s < e) {
            int mid = s + (e-s)/2;

            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
                return mid;
            }
            else if(arr[mid] < arr[mid+1]) {
                s = mid+1;
            }
            else {
                e = mid;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{0,2,1,0})); //ans is index : 1
    }
}
