package com.programmers.lvone;

import java.util.HashSet;
import java.util.Set;

class Solution1845 {
    public int solution(int[] nums) {
        int n = nums.length/2;

        Set<Integer> set = new HashSet<Integer>();

        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);

        if(set.size() > n)
            return n;
        else
            return set.size();
    }
}
