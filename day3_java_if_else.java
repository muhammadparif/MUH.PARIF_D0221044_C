package com.tutorial;

import java.util.*;

public class day2_java_if_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if ((n %2 == 1 ) && (n <= 100 )) {
            System.out.println("Weird");
        } else {
            if ((n %2 == 0)&&(n <= 5)) {
                System.out.println("Not Weird");
            } else {
                if ((n >= 6) && (n < 20)) {
                    System.out.println("weird");
                } else {
                    if ((n >= 20 )) {
                        System.out.println("not weird");
                    }
                }
            }
        }
    }
}
