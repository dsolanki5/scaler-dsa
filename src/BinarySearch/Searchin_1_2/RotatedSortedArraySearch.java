package BinarySearch.Searchin_1_2;

import java.util.Arrays;
import java.util.List;

public class RotatedSortedArraySearch {
	
	public static int search(final List<Integer> A, int B) {
	    int mid;
	    int start, end;
	    int count;
	    int num;
	    int n = A.size();
	    count = n;
	    // find the index of minimum element
	    int pivot = getMinElementIndex(A);
	    // Now we can binary search in two parts 0 - pivot and pivot to n-2
	    start = pivot;
	    end = n - 1;
	    int res = binarySearch(A, start, end, B);
	    if (res == -1) {
	        start = 0;
	        end = pivot - 1;
	        res = binarySearch(A, start, end, B);
	    }
	    return res;
	}
	
	public static int binarySearch(final List<Integer> A, int start, int end, int B) {
	    int count = end - start + 1;
	    int num, mid;
	    while (count > 0) {
	        mid = start + (end - start) / 2;
	        num = A.get(mid);
	        if (B == num)
	            return mid;
	        if (B < num)
	            end = mid - 1;
	        else
	            start = mid + 1;
	        count /= 2;
	    }
        return -1;
	}
	public static int getMinElementIndex(final List<Integer> A) {
	    int first, last, start, end;
	    int count, num, n;
	    int mid;
	    int next, prev;
	    n = A.size();
	    count = n;
	    first = A.get(0);
	    last = A.get(n - 1);
	    start = 0;
	    end = n - 1;
	    while (count > 0) {
	        mid = start + (end - start) / 2;
	        num = A.get(mid);
	        next = A.get((mid + 1) % n);
	        prev = A.get((mid - 1 + n) % n);
	        if (num < prev && num < next) {
	            return mid;
	        }
	        if (num > first && num > last)
	            start = mid + 1;
	        else 
	            end = mid - 1;
	        count /= 2;
        }
	    return -1;
	}

	public static void main(String[] args) {
	List<Integer> A = Arrays.asList(180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201, 202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29, 32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67, 69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102, 104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124, 126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155, 156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177);
	int B=42;
	String s = "";
	s+=(char)97;
	System.out.println(s);
	//System.out.println(search(A,B));

	}

}
