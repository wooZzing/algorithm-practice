package com.programmers.lvzero;

import java.util.Arrays;

public class Solution181866 {
    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                .filter(s -> !s.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }
}
