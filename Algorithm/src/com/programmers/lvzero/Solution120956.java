package com.programmers.lvzero;

class Solution120956 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for(int i=0; i<babbling.length; i++) {
            String tmp = babbling[i];
            int cnt = 0;

            for(int j=0; j<words.length; j++){
                if(tmp.indexOf(words[j]) > -1)
                    cnt += words[j].length();
            }

            if(tmp.length() == cnt)
                answer++;
        }

        return answer;
    }
}
