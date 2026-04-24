import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bf.readLine());
		long cnt = n;
		for(long i=2; i<=Math.sqrt(n); ++i) {
			if(n%i == 0) {
				cnt = cnt - cnt/i;
				while(n%i == 0) {
					n = n/i;
				}
			}
		}
		if(n>1) {
			cnt = cnt - cnt/n;
		}
		System.out.println(cnt);
	}
}
