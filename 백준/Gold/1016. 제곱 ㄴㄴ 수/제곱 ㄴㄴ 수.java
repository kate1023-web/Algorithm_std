import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();
		boolean[] num = new boolean[(int)(max-min+1)];
		
		for(long i=2; i*i<=max; i++) {
			long p = i*i;
			long st = min/p;
			if(min%p != 0) {
				st++;
			}
			for(long j=st; j*p<=max; ++j) {
				num[(int)((j*p)-min)] = true;
			}
		}
		
		int cnt=0;
		for(int i=0; i<=max-min; ++i) {
			if(!num[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
