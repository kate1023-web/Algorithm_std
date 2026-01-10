import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int small = sc.nextInt();
		int cnt = 0;
		
		
		for(int i=1; i<=num; ++i) {
			if(num%i == 0) cnt++;
			if(cnt == small) {
				System.out.println(i);
				break;
			}
		}
		
		if(cnt < small) System.out.println("0");
	}
}
