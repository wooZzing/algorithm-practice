package com.programmers.lvone;

class Solution17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] sr1 = binaryNumber(n, arr1);
        String[] sr2 = binaryNumber(n, arr2);
        String[] answer = sr1;

        for(int i=0; i<sr1.length; i++) {
            StringBuilder sb = new StringBuilder();

            for(int j=0; j<sr1[i].length(); j++) {
                if(sr1[i].charAt(j) == '1' || sr2[i].charAt(j) == '1')
                    sb.append("#");
                else
                    sb.append(" ");
            }

            answer[i] = new String(sb);
        }

        return answer;
    }

    public String[] binaryNumber(int n, int[] arr) {
        String[] r = new String[arr.length];

        for(int i=0; i<r.length; i++) {
            StringBuilder sb = new StringBuilder();
            int w = arr[i];
            while(w>0) {
                sb.append(w%2);
                w/=2;
            }

            while(sb.length() < n) {
                sb.append("0");
            }

            r[i] = new String(sb.reverse());
        }

        return r;
    }
}
