package com.company;
import java.io.*;
import java.util.Scanner;

public class Special_Characters {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))) {
                count++;
            }

        }
        if (count == 0) {
            System.out.println("No Special Characters Found");
        } else {
            System.out.println("String has " + count + " Special Characters");
        }
    }
}

