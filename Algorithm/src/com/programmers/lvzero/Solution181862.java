package com.programmers.lvzero;

import java.util.Arrays;

public class Solution181862 {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("[abc]"))
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);

        return answer.length == 0 ? new String[]{"EMPTY"} : answer;

    }
}
