import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] cnt = new int[3];
        int[] ans_1 = {1, 2, 3, 4, 5};
        int[] ans_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ans_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<answers.length; ++i) {
            if(answers[i] == ans_1[i%ans_1.length]) cnt[0]++;
            if(answers[i] == ans_2[i%ans_2.length]) cnt[1]++;
            if(answers[i] == ans_3[i%ans_3.length]) cnt[2]++;
        }
        int max = -1;
        for(int i=0; i<cnt.length; ++i) {
            if(max <= cnt[i]) max = cnt[i];
        }
        int c =0;
        for(int i=0; i<cnt.length; ++i) {
            if(max == cnt[i]) {
                c++;
            }
        }
        int[] answer = new int[c];
        c = 0;
        for(int i=0; i<cnt.length; ++i) {
            if(max == cnt[i]) {
                answer[c++] = i+1;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}