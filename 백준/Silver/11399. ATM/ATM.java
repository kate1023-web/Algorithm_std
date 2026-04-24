import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		int[] sum = new int[n];
		for(int i=0; i<n;++i) {
			num[i] = sc.nextInt();
		}
		for(int i=0; i<n; ++i) {
			int index = i;
			int idxn = num[i];
			for(int j = i-1; j>=0; --j) {
				if(num[j] < num[i]) {
					index = j+1;
					break;
				}
				if(j == 0) {
					index = 0;
				}
			}
			for(int j=i; j>index; --j) {
				num[j] = num[j-1];
			}
			num[index] = idxn;
		}
		sum[0] = num[0];
		for(int i=1; i<n; ++i) {
			sum[i] = sum[i-1]+num[i];
		}
		int res = 0;
		for(int i=0; i<n; ++i) {
			res += sum[i];
		}
		System.out.println(res);
	}
}
