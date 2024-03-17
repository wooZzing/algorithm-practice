package com.baekjoon.basicone;

import java.io.*;
import java.util.*;


public class problem1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> ls = new Stack<Character>();
        Stack<Character> rs = new Stack<Character>();

        char[] chArr = br.readLine().toCharArray();
        for(char ch : chArr){
            ls.push(ch);
        }

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String command = br.readLine();

            switch (command.charAt(0)) {
                case 'L' :
                        if(!ls.empty())
                            rs.push(ls.pop());
                    break;
                case 'D' :
                        if(!rs.empty())
                            ls.push(rs.pop());
                    break;
                case 'B' :
                        if(!ls.empty())
                            ls.pop();
                    break;
                case 'P' :
                    char pch = command.charAt(2);
                    ls.push(pch);
                    break;
            }
        }

        while(!ls.empty())
            rs.push(ls.pop());

        while(!rs.empty()) {
            bw.write(rs.pop());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}