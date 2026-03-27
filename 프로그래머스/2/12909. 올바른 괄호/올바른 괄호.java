class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        if(s.charAt(0) == ')') answer = false;
        else {
            int cnt = 0;
            for(int i=0; i<s.length(); ++i) {
                if(s.charAt(i) == '(') cnt++;
                else cnt--;
                if(cnt < 0 ) break;
            }
            if(cnt != 0) answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}