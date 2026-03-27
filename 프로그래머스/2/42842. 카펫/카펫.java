import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x=0, y=0;
        int sum = brown+yellow;
        for(int i=1; i<=(yellow/2); ++i) {
            if(yellow%i == 0) {
                if((i+2)*((yellow/i)+2) == sum) {
                    if(i < (yellow/i)) {
                        x = (yellow/i)+2;
                        y = i+2;
                    }
                    else {
                        x = i+2;
                        y = (yellow/i)+2;
                    }
                }
            }
        }
        if(yellow == 1) {
            x = 3;
            y = x;
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}