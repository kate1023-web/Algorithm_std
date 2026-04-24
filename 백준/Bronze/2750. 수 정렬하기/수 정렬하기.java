import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; ++i) {
			num[i] = sc.nextInt();
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1-i; j++) {
				if(num[j] > num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<n; ++i) {
			System.out.println(num[i]);
		}
	}
}
