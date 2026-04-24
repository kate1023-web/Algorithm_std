import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n;++i) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		int fnd = sc.nextInt();
		for(int i=0; i<fnd; ++i) {
			boolean f = false;
			int find = sc.nextInt();
			int s = 0;
			int e = num.length-1;
			while(s <= e) {
				int m = (s+e)/2;
				int mn = num[m];
				if(mn > find) {
					e = m-1;
				}
				else if (mn < find) {
					s = m+1;
				}
				else {
					f = true;
					break;
				}
			}
			if(f) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
	}
}
