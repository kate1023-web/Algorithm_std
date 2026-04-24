import java.util.Scanner;

public class Main {
	static int ans = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split("-");
		for(int i=0; i<s.length; ++i) {
			int tmp = mySum(s[i]);
			if(i == 0) {
				ans += tmp;
			}
			else {
				ans -= tmp;
			}
		}
		System.out.println(ans);
	}
	
	static int mySum(String st) {
		int sum = 0;
		String str[] = st.split("[+]");
		for(int i=0; i<str.length; ++i) {
			sum += Integer.parseInt(str[i]);
		}
		return sum;
	}
}
