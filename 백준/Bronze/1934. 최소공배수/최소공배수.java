import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		int a, b;
		int max=0;
		
		cnt = sc.nextInt();
		
		for(int i=0; i<cnt; ++i) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a>b) {
				for(int j=1; j<=a; ++j) {
					if(a%j == 0 && b%j == 0) {
						max = j;
					}
					else {
						continue;
					}
				}
				System.out.println((a*b)/max);
			}
			else if (a<b) {
				for(int j=1; j<=b; ++j) {
					if(a%j == 0 && b%j == 0) {
						max = j;
					}
					else {
						continue;
					}
				}
				System.out.println((a*b)/max);
			}
			else {
				for(int j=1; j<=b; ++j) {
					if(a%j == 0 && b%j == 0) {
						max = j;
					}
					else {
						continue;
					}
				}
				System.out.println((a*b)/max);
			}
		}
	}
}