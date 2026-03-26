class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int max = 0;
        for(int i=1; i<=citations.length; ++i) {
            int cnt = 0;
            for(int j=0; j<citations.length; ++j) {
                if(i <= citations[j]) cnt++;
            }
            if(max <= i && i <= cnt) max = i;
        }
        answer = max;
        return answer;
    }
}