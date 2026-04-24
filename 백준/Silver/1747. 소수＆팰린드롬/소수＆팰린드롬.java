import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[10000001];
		for(int i=2; i<num.length; ++i) {
			num[i] = i;
		}
		
		for(int i=2; i<Math.sqrt(num.length); ++i) {
			if(num[i] == 0) {
				continue;
			}
			for(int j=i+i; j<num.length; j=j+i) {
				num[j] = 0;
			}
		}
		
		int cnt = n;
		while(true) {
			if(num[cnt] != 0) {
				int res = num[cnt];
				if(ispalindrome(res)) {
					System.out.println(res);
					break;
				}
			}
			cnt++;
		}
	}
	
	public static boolean ispalindrome(int res) {
		char tmp[] = String.valueOf(res).toCharArray();
		int s = 0;
		int e = tmp.length-1;
		while(s < e) {
			if(tmp[s] != tmp[e]) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
