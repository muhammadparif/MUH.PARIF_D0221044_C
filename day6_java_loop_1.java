package com.tutorial;

import java.util.*;
import java.io.*;

public class day6_java_loop_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt();
        for (int i = 1; i < 10+1; i++){
            System.out.println(N + " X "+ i + " = " + N*i );
        }
    }
}
