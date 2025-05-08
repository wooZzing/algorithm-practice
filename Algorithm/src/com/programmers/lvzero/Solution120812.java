package com.programmers.lvzero;

import java.util.Arrays;

class Solution120812 {
    public int solution(int[] array) {
        int answer = 0;
        int[][] arr = new int[1000][2];
        for(int i=0; i<array.length; i++) {
            arr[array[i]][0] = array[i];
            arr[array[i]][1] +=1;
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));

        if(arr[0][1] == arr[1][1])
            answer = -1;
        else
            answer = arr[0][0];

        return answer;
    }
}
