package com.programmers.lvzero;

import java.util.HashMap;
import java.util.Map;

class Solution120838 {
    public String solution(String letter) {
        Map<String, String> map = new HashMap<>();
        map.put(".-", "a");
        map.put("-...", "b");
        map.put("-.-.", "c");
        map.put("-..", "d");
        map.put(".", "e");
        map.put("..-.", "f");
        map.put("--.", "g");
        map.put("....", "h");
        map.put("..", "i");
        map.put(".---", "j");
        map.put("-.-", "k");
        map.put(".-..", "l");
        map.put("--", "m");
        map.put("-.", "n");
        map.put("---", "o");
        map.put(".--.", "p");
        map.put("--.-", "q");
        map.put(".-.", "r");
        map.put("...", "s");
        map.put("-", "t");
        map.put("..-", "u");
        map.put("...-", "v");
        map.put(".--", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("--..", "z");

        String[] arr = letter.split(" ");
        String answer = "";

        for(int i=0; i<arr.length; i++)
            if(map.get(arr[i]) != null) answer+=map.get(arr[i]);

        return answer;
    }
}
