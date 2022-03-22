package com.tutorial;

import java.io.*;
import java.util.*;


public class day7_java_loop_2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int nilai = a;
            for (int k=0; k< n; k++){
                nilai = nilai + (int) Math.pow(2, k) * b ;
                System.out.print(nilai +" ");
            }
            System.out.println();
        }
    }
}

