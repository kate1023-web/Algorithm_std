import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int end = -1;
		int cnt =0;
		int[][] num = new int[n][2];
		for(int i=0; i<n; ++i) {
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt();
		}
		
		Arrays.sort(num, new Comparator<int[]>() {
			public int compare(int[] s, int e[]) {
				if(s[1] == e[1]) {
					return s[0] - e[0];
				}
				return s[1] - e[1];
			}
		});
		
		for(int i=0; i<n; ++i) {
			if(end <= num[i][0]) {
				end = num[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
