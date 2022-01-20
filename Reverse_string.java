package com.company;
import java.util.*;

public class Reverse_string {
    public static void main(String[] args) {
        String s = "My name is Abhishek", ns = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println("My name is Abhishek");

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            ns = ch + ns;
        }
        System.out.println("Reversed word: " + ns);
    }
}

