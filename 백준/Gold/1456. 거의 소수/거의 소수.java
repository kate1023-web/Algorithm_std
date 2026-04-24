import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long e = sc.nextLong();
		long[] num = new long[10000001];
		for(int i=2; i<num.length; ++i) {
			num[i] = i;
		}
		
		for(int i=2; i<=Math.sqrt(num.length); ++i) {
			if(num[i] == 0) {
				continue;
			}
			for(int j=i+i; j<num.length; j=j+i) {
				num[j] = 0;
			}
		}
		
		int cnt = 0;
		for(int i=2; i<10000001; ++i) {
			if(num[i] != 0) {
				long tmp = num[i];
				while((double)num[i] <= (double)e/(double)tmp) {
					if((double)num[i] >= (double)s/(double)tmp) {
						cnt++;
					}
					tmp = tmp*num[i];
				}
			}
		}
		System.out.println(cnt);
	}
}
