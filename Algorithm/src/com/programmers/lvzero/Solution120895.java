package com.programmers.lvzero;

class Solution120895 {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;

        return new String(arr);
    }
}
