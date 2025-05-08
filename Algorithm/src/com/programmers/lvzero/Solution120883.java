package com.programmers.lvzero;

class Solution120883 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        int n = db.length;
        for(int i=0; i<n; i++) {
            if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                answer = "login";
                break;
            }
            else if(id_pw[0].equals(db[i][0])) {
                answer = "wrong pw";
                break;
            }
        }

        return answer;
    }
}
