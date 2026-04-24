import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int[] num = new int[m];
		int cnt = 0;
		for(int i=0; i<m; ++i) {
			num[i] = sc.nextInt();
			cnt += num[i];
		}
		int k = sc.nextInt();
		double avg = 0.0;
		double total = 1.0;
		
		for(int i=0; i<k; ++i) {
			total *= (cnt-i);
			total /= (i+1);
		}
		
		for(int i=0; i<m; ++i) {
			double sum = 1.0;
			if(num[i] >= k) {
				for(int j=0; j<k; ++j) {
					sum *= (num[i] - j);
					sum /= (j+1);
				}
				avg += sum / total;
			}
		}
		System.out.println(avg);
	}
}
