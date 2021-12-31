package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = Integer.parseInt(br.readLine());

        for(int i=0; i<result; i++){
            String str = br.readLine().trim();
            String vega = "(100+1+|01)+";
            System.out.println(str.matches(vega)? "YES": "NO");

        }



    }
}
