package com.programmers.lvzero;

class Solution120863 {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");

        int xnum = 0;
        int num = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].indexOf("x") == 0)
                xnum += 1;
            else if(arr[i].indexOf("x") > 0)
                xnum += Integer.parseInt(arr[i].substring(0,arr[i].indexOf("x")));
            else
                num += Integer.parseInt(arr[i]);
        }

        String answer = "";

        if(xnum != 0) {
            answer += xnum != 1 ? xnum+"x" : "x";
        }

        if(num != 0) {
            if(answer.equals("")) {
                answer = num+"";
            } else {
                answer += " + " + num;
            }
        }

        return answer;
    }
}
