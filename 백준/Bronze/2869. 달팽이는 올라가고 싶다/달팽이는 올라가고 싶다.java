import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sc = br.readLine();
		
		StringTokenizer st = new StringTokenizer(sc);
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		/* 달팽이가 정상에 도달하는 순간에는 미끄러지지 않음
		 * 즉, "정상에 도착하기 전날까지의 높이"를 계산하는 것이 포인트
		 * 목표: 낮에 A만큼 올라가서 V에 도달해야 함
		 * 실질적으로 올라가야 할 거리: (V - B) (마지막 날 밤에 미끄러지는 것은 계산할 필요가 없으므로, 전체 높이에서 미끄러지는 양을 미리 빼준 값을 기준으로 함)
		 * 하루에 실제로 올라가는 거리: (A - B)
		 * 이때, 나누어떨어지지 않고 나머지가 남는다면 하루가 더 필요함을 의미하므로 올림 처리*/
		
		int day = (v-b)/(a-b);
		
		if((v-b)%(a-b) != 0) {
			day++;
		}
		
		System.out.println(day);
	}
}
