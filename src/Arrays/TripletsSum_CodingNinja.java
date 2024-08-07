package Arrays;

import java.util.*;

public class TripletsSum_CodingNinja {

    public static ArrayList<ArrayList<Integer>> findTriplets_brute(int[] arr, int n, int K) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        int l = 0;

        for (int i = 0; i < n - 2; i++) {
            boolean flag = false;
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == K) {
                        if(!(al.contains(arr[i]) && al.contains(arr[j]) && al.contains(arr[k]))) {
                            al.add(l++, arr[i]);
                            al.add(l++, arr[j]);
                            al.add(l++, arr[k]);

                            int m = l-3;
                            ArrayList<Integer> sl = new ArrayList<>();
                            for(; m<l; m++) {
                                sl.add(al.get(m));
                            }
                            ans.add(sl);

                            flag = true;
                            break;
                        }
                    }
                }
                if(flag)
                    break;
            }
        }
        if(ans.size() == 0){
            al.add(-1);
            ans.add(al);
        }

        return ans;
    }

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
        ArrayList<ArrayList<Integer>> finalAl = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {

            int num1 = arr[i];
            int target = K - num1;
            int ptr1 = i + 1;
            int ptr2 = n - 1;

            while (ptr1 < ptr2) {
                int twoPtrSum = arr[ptr1] + arr[ptr2];
                int x = arr[ptr1];
                int y = arr[ptr2];

                if (twoPtrSum < target) {
                    ptr1++;
                } else if (twoPtrSum > target) {
                    ptr2--;
                } else {

                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(num1);
                    temp.add(x);
                    temp.add(y);
                    finalAl.add(temp);

                    while (ptr1 < ptr2 & x == arr[ptr1]) {
                        ptr1++;
                    }


                    while (ptr1 < ptr2 & y == arr[ptr2]) {
                        ptr2--;
                    }

                }
            }

            while (i < n && num1 == arr[i]) {
                i++;
            }
        }


        return finalAl;
    }

    public static void main(String[] args) {
		int ar[] = {10 ,5 ,5 ,5 ,2}; int K = 12;
//		int ar[] = {-26 ,32 ,4 ,17 ,-16 ,18 ,1 ,8 ,6 ,8 ,3 ,-13}; int K = 10;
//		int ar[] = {2 ,-95 ,9 ,1 ,-79 ,88 ,96 ,0, 5}; int K = 10;
//		int ar[] = {7 ,-36 ,5 ,3 ,41 ,5}; int K = 10;
//		int ar[] = {4 ,4 ,-40 ,27 ,1 ,6 ,36 ,3 ,-50 }; int K = -10;
//		int ar[] = {9, 5 ,-20 ,-70 ,2 ,1 ,82 ,1 ,4 ,8 ,55 ,-100 }; int K = -10;
//      int ar[] = {1, 2, 3, 1, 2, 3}; int K = 6;
//      int ar[] = {1, 2, 3, 4}; int K = 11;
//        int ar[] = {1, 1, 2, 2, 1, 1}; int K = 4;

//        System.out.println(findTriplets_brute(ar, ar.length, K));
//        System.out.println(findTriplets(ar, ar.length, K));
        System.out.println(findTriplets2(ar, ar.length, K));
    }

    private static ArrayList<ArrayList<Integer>> findTriplets2(int[] arr, int n, int K) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i<n-2; i++) {
            int a = arr[i];
            int j=i+1, k=n-1;
            while(j < k){
                int b = arr[j];
                int c = arr[k];
                int sum = a+b+c;

                if(sum < K) {
                    j++;
                }
                else if(sum > K) {
                    k--;
                }
                else {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(a); al.add(b); al.add(c);
                    ans.add(al);

                    while(j<k && arr[j] == arr[j+1]){
                        j++;
                    }

                    while(j<k && arr[k] == arr[k-1]){
                        k--;
                    }

                    j++;
                    k--;
                }
            }
            while((i+1 < n) && (arr[i] == arr[i+1])){
                i++;
            }
        }
        if(ans.size() == 0){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(-1);
            ans.add(al);
        }

        return ans;

    }

}