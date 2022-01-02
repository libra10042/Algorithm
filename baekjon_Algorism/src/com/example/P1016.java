package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 에라토스테네스의 체 사용. ( 소수를 찾을 때 사용 )
public class P1016 {

    static Long min, max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        min = Long.parseLong(st.nextToken());
        max = Long.parseLong(st.nextToken());


        solve();

    }

    public static void solve(){
        int end = (int) Math.sqrt(max);
        boolean []checkArray = new boolean[1000001];
        Arrays.fill(checkArray, false);
        for(long i=2; i<=end ; i++){
            long square = i * i;
            long start = ((min-1)/square + 1) * square;
            for(long a = start; a<=max; a+= square){
                checkArray[(int)(a-min)] = true;
            }
        }
        int count =0;
        for(int i=0; i<(max-min + 1); i++){
            count += (checkArray[i] == true) ? 1 : 0;

        }
        System.out.println(max -min -count +1);



    }


}


