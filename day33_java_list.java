package com.tutorial;

import java.util.*;

public class day33_java_list {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.add(element);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String query = sc.next();
            if (query.equals("Delete")) {
                int x = sc.nextInt();
                list.remove(x);
            } else if (query.equals("Insert")) {
                int x = sc.nextInt();
                int y = sc.nextInt();// value yang ditambahkan
                list.add(x, y);
            }

        }

        // cetak
        for (int value : list) {
            System.out.print(value + " ");
        }

    }
}