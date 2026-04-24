import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mon = sc.nextInt();
		int[] num = new int[n];
		int cnt = 0;
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		for(int i=n-1; i>=0; --i) {
			if(num[i] <= mon) {
				cnt = cnt + mon/num[i];
				mon = mon%num[i];
			}
		}
		System.out.println(cnt);
	}
}
