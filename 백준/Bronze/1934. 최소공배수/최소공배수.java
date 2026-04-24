import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i=0; i<cnt; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int res = a*b/gcd(a, b);
			System.out.println(res);
		}
	}
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
}
