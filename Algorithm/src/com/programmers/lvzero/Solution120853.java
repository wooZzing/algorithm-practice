package com.programmers.lvzero;

class Solution120853 {
    public int solution(String s) {
        String[] arr = s.split(" ");
        int answer = 0;
        int tmp = Integer.parseInt(arr[0]);

        for(int i=1; i<arr.length; i++) {
            if(arr[i].equals("Z"))
                tmp = 0;
            else {
                answer += tmp;
                tmp = Integer.parseInt(arr[i]);
            }
        }
        answer += tmp;

        return answer;
    }
}
