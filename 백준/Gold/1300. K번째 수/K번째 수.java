import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int s = 1;
		int e = k;
		int res = 0;
		while(e>=s) {
			int m = (s+e)/2;
			int cnt = 0;
			for(int i=1; i<=n; ++i) {
				cnt += Math.min(m/i, n);
			}
			if(cnt<k) {
				s = m+1;
			}
			else {
				res = m;
				e = m-1;
			}
		}
		System.out.println(res);
	}
}
