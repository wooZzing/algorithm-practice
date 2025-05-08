package com.programmers.lvzero;

class Solution120902 {
    public int solution(String my_string) {
        int answer = 0;

        String[] arr = my_string.split(" ");

        boolean flag = true;
        for(int i=0; i<arr.length; i++) {
            if("+".equals(arr[i])) {
                flag = true;
            } else if("-".equals(arr[i])) {
                flag = false;
            } else {
                int tmp = Integer.parseInt(arr[i]);
                answer = flag ? answer +  tmp : answer - tmp;
            }
        }
        return answer;
    }
}
