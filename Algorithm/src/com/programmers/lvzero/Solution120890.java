package com.programmers.lvzero;

class Solution120890 {
    public int solution(int[] array, int n) {
        int answer = array[0];

        int k=array.length;
        for(int i=1; i<k; i++) {
            if(Math.abs(answer-n) > Math.abs(array[i]-n))
                answer = array[i];
            else if(Math.abs(answer-n) == Math.abs(array[i]-n))
                answer = answer<array[i] ? answer : array[i];
        }
        return answer;
    }
}
