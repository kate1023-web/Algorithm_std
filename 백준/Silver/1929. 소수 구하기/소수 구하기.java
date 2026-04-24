import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] num = new int[n+1];
		for(int i=0; i<n+1; ++i) {
			num[i] = i;
		}
		num[1] = 0;
		for(int i=2; i<=Math.sqrt(n); ++i) {
			if(num[i] == 0) {
				continue;
			}
			for(int j=i+i; j<=n; j=j+i) {
				num[j] = 0;
			}
		}
		
		for(int i=m; i<n+1; ++i) {
			if(num[i] != 0) {
				System.out.println(num[i]);
			}
		}
	}
}
