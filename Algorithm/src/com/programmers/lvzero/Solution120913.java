package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

class Solution120913 {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<>();
        while(my_str.length() > 0) {
            String tmp = my_str.length() > n ? my_str.substring(0, n) : my_str;

            my_str =  my_str.length() > n ? my_str.substring(n) : "";

            list.add(tmp);
        }

        return list.toArray(new String[0]);
    }
}
