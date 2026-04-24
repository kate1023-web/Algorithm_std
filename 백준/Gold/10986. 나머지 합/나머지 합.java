import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] sum = new long[n];
		long[] rem = new long[m];
		
		for(int i=0; i<n; ++i) {
			if(i == 0) sum[i] = sc.nextInt();
			else sum[i] += sum[i-1] + sc.nextInt(); 
		}
		
		long cnt = 0;
		for(int i=0; i<n; ++i) {
			int res = (int) (sum[i] % m);
			if(res == 0) cnt ++;
			rem[res]++;
		}
		
		for(int i=0; i<m; ++i) {
			if (rem[i] > 1) {
				cnt += (rem[i]*(rem[i]-1)/2);
			}
		}
		System.out.println(cnt);
	}
}
