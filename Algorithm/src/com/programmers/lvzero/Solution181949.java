package com.programmers.lvzero;

import java.util.Scanner;

public class Solution181949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) > 'Z')
                System.out.print((a.charAt(i)+"").toUpperCase());
            if(a.charAt(i) < 'a')
                System.out.print((a.charAt(i)+"").toLowerCase());
        }
    }
}
