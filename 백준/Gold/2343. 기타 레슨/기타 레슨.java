import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bn = sc.nextInt();
		int[] num = new int[n];
		int e = 0;
		int s = 0;
		for(int i=0; i<n; ++i) {
			num[i] = sc.nextInt();
			e+=num[i];
			if(s < num[i]) s = num[i];
		}
		while(e>=s) {
			int m = (e+s)/2;
			int sum = 0;
			int cnt = 0;
			for(int i=0; i<n; ++i) {
				if(sum+num[i] > m) {
					cnt++;
					sum=0;
				}
				sum += num[i];
			}
			if (sum != 0) {
				cnt++;
			}
			if(cnt>bn) {
				s = m+1;
				
			}
			else {
				e = m-1;
			}
		}
		System.out.println(s);
	}
}
