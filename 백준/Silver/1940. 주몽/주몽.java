import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; ++i) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		int stp = 0;
		int enp = n-1;
		int cnt = 0;
		while (stp < enp) {
			if(num[stp] + num[enp] == val) {
				cnt++;
				stp++;
				enp--;
			}
			else if(num[stp] + num[enp] > val) {
				enp--;
			}
			else if(num[stp] + num[enp] < val) {
				stp++;
			}
		}
		System.out.println(cnt);
	}
}
