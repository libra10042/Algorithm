package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2749 {
    // 피보나치
    public static int dp[], p = 1000000;

    public static int Fibo(int n){
        if(n == 0 || n == 1) return n;
        else if (dp[n] != 0) return dp[n] % p;
        else return dp[n] = (Fibo(n-1) + Fibo(n-2)) % p;
    }

    public static void main(String[] args) throws IOException {
        //BufferdReader는 따로 Exception 처리를 해주어야 한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        br.close();

        System.out.println(Fibo(n));
    }

}
