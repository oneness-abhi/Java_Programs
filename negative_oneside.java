package com.company;
import java.util.Arrays;
public class negative_oneside {
    public static void main(String[] args) {
        int[] arr = {1, 45, -4, -10, 55, -1, 20, -34, -45};
        Arrays.sort(arr);
//        System.out.println("Given Array: "+ arr);
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
}
