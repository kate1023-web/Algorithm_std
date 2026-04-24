import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		double max = -1;
		double sum = 0;
		for (int i=0; i<n; ++i) {
			num[i] = sc.nextInt();
			if (num[i] > max) max = num[i];
			sum += num[i];
		}
		System.out.println(sum*100.0/max/n);
	}
}