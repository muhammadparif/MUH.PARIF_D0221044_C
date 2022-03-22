package com.tutorial;

import java.io.*;
import java.util.*;

public class day19_java_string_tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer stoken = new StringTokenizer(s);
        int n = stoken.countTokens();
        System.out.println(n);
        for (int i =0; i<n; i++){
            System.out.println(stoken.nextToken());
        }
        scan.close();
    }
}

