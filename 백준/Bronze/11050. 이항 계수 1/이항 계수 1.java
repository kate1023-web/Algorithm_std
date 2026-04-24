import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		
		n = sc.nextInt();
		k = sc.nextInt();
		double sum=1, sum2=1;
		
		for(int i=0; i<k;++i) {
			sum = sum*(n-i);
		}
		for(int i=1; i<=k; ++i) {
			sum2 = sum2*i;
		}
		System.out.printf("%.0f",sum/sum2);
	}
}