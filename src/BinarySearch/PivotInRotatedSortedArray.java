package BinarySearch;

public class PivotInRotatedSortedArray {

    public static int getPivot(int[] arr, int n){
        int s = 0;
        int e = n-1;

        while(s < e) {
            int mid = s+ (e-s)/2;

            if(arr[mid] >= arr[0]) {
                s = mid+1;
            }
            else {
                e = mid;
            }
        }
        return s;
    }

    public static void main(String[] args) {
//        int[] arr = {7,9,1,2,3}; //ans : pivot index is 2
//        int[] arr = {1,3};  //ans : pivot index is 0
        int[] arr = {3,1};  //ans : pivot index is 0
        System.out.println(getPivot(arr, arr.length));
    }
}
