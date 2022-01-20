package com.company;
import java.util.Arrays;

public class triplets_sum {
    public static boolean findTriplet(int[] arr, int sum) {

        if(arr.length < 3) {
            return false;
        }

        Arrays.sort(arr);
        int len = arr.length;

        for(int i = 0; i < len; i++) {

            int start = i+1;
            int end = len-1;

            while(start < end) {

                if(arr[i] + arr[start] + arr[end] == sum) {
                    return true;

                } else if (arr[i] + arr[start] + arr[end] < sum) {
                    start++;

                } else {
                    end--;

                }
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int[] arr = { 1, 4, 45, 6, 10, 8};
        int k = 13;

        boolean result = findTriplet(arr, k);

        if(result) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }
    }
}
