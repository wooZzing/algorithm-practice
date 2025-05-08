package com.programmers.lvzero;

class Solution120844 {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        for(int i=0; i<numbers.length; i++){
            if(direction.equals("right"))
                answer[i] = i == 0 ? numbers[numbers.length-1] : numbers[i-1];
            else
                answer[i] = i == numbers.length-1 ? numbers[0] : numbers[i+1];
        }

        return answer;
    }
}
