package com.programmers.lvone;

class Solution17682 {
    public int solution(String dartResult) {
        int[] score = new int[3];

        int len = dartResult.length();
        int inx = -1;

        for(int i=0; i<len; i++) {
            char c = dartResult.charAt(i);

            if(Character.isDigit(c)) {
                inx++;

                if(c == '1' && i+1 < len && dartResult.charAt(i+1) == '0') {
                    score[inx] = 10;
                    i++;
                } else {
                    score[inx] = c - '0';
                }
            }
            else if(c == 'S') {
                score[inx] = (int) Math.pow(score[inx],1);
            }
            else if(c == 'D') {
                score[inx] = (int) Math.pow(score[inx],2);
            }
            else if(c == 'T') {
                score[inx] = (int) Math.pow(score[inx],3);
            }

            else if(c == '*') {
                if(inx > 0)
                    score[inx-1] *= 2;

                score[inx] *= 2;
            }
            else if(c == '#') {
                score[inx] *= -1;
            }
        }

        return score[0] + score[1] + score[2];
    }
}
