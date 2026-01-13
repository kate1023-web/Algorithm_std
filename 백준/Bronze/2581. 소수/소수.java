import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int min = m;
		int sum = 0;
		
		for(int i=n; i<=m; ++i) {
			int prime = 0;
			for(int j=1; j<=i; ++j) {
				if(i%j == 0) prime++;
			}
			if(prime == 2) {
				sum += i;
				if(min > i) min = i;
			}
		}
		
		if(sum == 0)System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
