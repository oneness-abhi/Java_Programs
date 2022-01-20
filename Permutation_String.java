package com.company;
import java.util.Scanner;
public class Permutation_String {
    static void permute(String s, String ans){
        if (s.length()==0){
            System.out.println(ans+" ");
        }
        else{
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                String left = s.substring(0,i);
                String right = s.substring(i+1);
                String rest = left+right ;
                permute(rest,ans + ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String ans = " ";
        System.out.println("Permutation of Strings: ");
        permute(s,ans);
    }
}
