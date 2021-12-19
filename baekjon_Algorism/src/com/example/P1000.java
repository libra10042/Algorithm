package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1000 {

    // 정수 N개의 합.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        br.close();

        addSum(a, b);
        System.out.println(addSum(a, b));

    }
    public static int addSum(int a, int b){
        return a + b;

    }
}
