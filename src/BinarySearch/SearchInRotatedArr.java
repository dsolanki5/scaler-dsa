package BinarySearch;

/**
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 */
public class SearchInRotatedArr {

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = PivotInRotatedSortedArray.getPivot(nums, n);

        if(target == nums[pivotIndex]) {
            return pivotIndex;
        }
        else if(target >= nums[pivotIndex] && target <= nums[n-1]) {
            return binarySearch(nums, pivotIndex, n, target);
        }
        else {
            return binarySearch(nums, 0, pivotIndex, target);
        }

    }

    public static int binarySearch(int[] nums, int s, int n, int target) {
        int e = n-1;

        while(s <= e) {
            int mid = s + (e-s)/2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(target > nums[mid]) {
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2}; //ans: target is at index 4
        int target = 0;
//        int[] nums = {1,3}; //ans: target is at index 1
//        int target = 3;
//        int[] nums = {3,1}; //ans: target is at index 0
//        int target = 3;
//        int[] nums = {4,5,6,7,0,1,2}; //ans: -1 ( target not found)
//        int target = 3;
        System.out.println(search(nums, target));

    }
}
