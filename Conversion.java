package com.company;
import java.io.*;
import java.util.Arrays;

public class Conversion {
    public static void main(String[] args){
        String s = "1,2,3,4,5";
        String[] str = s.split(",");
        int[] arr = new int[str.length];

            for (int i = 0; i < str.length; i++)
                arr[i] = Integer.valueOf(str[i]);

        System.out.println("String : "+ s);
        System.out.println("Integer Array: "+ Arrays.toString(arr));

    }
}
