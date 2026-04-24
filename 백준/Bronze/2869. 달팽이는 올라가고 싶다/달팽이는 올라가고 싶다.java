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
		
		int day = (v-b)/(a-b);
		
		if((v-b)%(a-b) != 0) {
			day++;
		}
		
		System.out.println(day);
	}
}