package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class kth_max {
    public static int kth_largest(Integer[] arr, int k){
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        return arr[k-1];
    }
    public static void main(String[] args) {
        Integer arr[] = new Integer[] {3, 1, 5, 4, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kth Value: ");
        int k = sc.nextInt();
        System.out.println("Kth largest element :"+ kth_largest(arr, k));
    }
}
