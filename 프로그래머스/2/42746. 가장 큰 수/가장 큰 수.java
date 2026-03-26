import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; ++i) {
            str[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(str, (x,y) -> (y+x).compareTo(x+y));
        
        if(str[0].equals("0")) answer = "0";
        else {
            for(int i=0; i<str.length; ++i) {
                answer += str[i];
            }
        }
        return answer;
    }
}