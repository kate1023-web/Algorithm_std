import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; ++i) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		int cnt=0;
		for(int i=0; i<n; ++i) {
			int stp = 0;
			int enp = n-1;
			int val = num[i];
			while (stp < enp) {
				if(num[stp]+num[enp] == val) {
					if(stp != i && enp != i) {
						cnt++;
						break;
					}
					else if(stp == i) stp++;
					else if(enp == i) enp--;
				}
				else if(num[stp]+num[enp] > val) {
					enp--;
				}
				else stp++;
			}
		}
		System.out.println(cnt);
	}
}
