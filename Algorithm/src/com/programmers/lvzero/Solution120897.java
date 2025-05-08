package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution120897 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);

        for(int i=1; i <= sqrt; i++) {
            if(n%i == 0) {
                list.add(i);

                if(i != n/i)
                    list.add(n/i);
            }
        }
        list.sort(Comparator.naturalOrder());

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
