import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1. BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // N 입력 처리
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        
        // StringTokenizer로 한 줄을 빠르게 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        
        // M 입력 처리
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        // 2. StringBuilder로 출력 문자열 구성
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            if (set.contains(target)) {
                sb.append(1).append(" ");
            } else {
                sb.append(0).append(" ");
            }
        }
        
        // 마지막에 한 번만 출력
        System.out.println(sb.toString().trim());
    }
}