import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt=0;
		
		for(int i=0; i<n; ++i) {
			int num = sc.nextInt();
			int m_cnt = 0;
			for(int j=1; j<=num; ++j) {
				if(num%j == 0) m_cnt++;
			}
			if(m_cnt == 2)cnt++;
		}
		
		System.out.println(cnt);
	}
}
