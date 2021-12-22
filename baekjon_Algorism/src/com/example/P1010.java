package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1010 {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());

        while(k-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(combi(Math.max(a, b), Math.min(a, b)) + "\n");
        }
        System.out.println(sb);
    }

    static int combi(int n, int r){
        if(r ==0 || n == r) return 1;
        return combi(n-1, r-1) + combi(n-1, r);
    }

}
