package com.programmers.lvzero;

public class Solution181923 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            int min = 1_000_001;

            for(int j=queries[i][0]; j<=queries[i][1]; j++) {
                if(arr[j] > queries[i][2] && min > arr[j])
                    min = arr[j];
            }

            answer[i] = min == 1_000_001 ? -1 : min;
        }
        return answer;
    }
}
