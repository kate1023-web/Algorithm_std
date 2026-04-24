import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] num = new int[str.length()];
		for(int i=0; i<str.length(); ++i) {
			num[i] = Integer.parseInt(str.substring(i, i+1));
		}
		for(int i=0; i<str.length(); ++i) {
			int max = i;
			for(int j = i+1; j<str.length(); ++j) {
				if(num[j] > num[max]) max = j;
			}
			if(num[i] < num[max]) {
				int tmp = num[i];
				num[i] = num[max];
				num[max]  = tmp;
			}
		}
		for(int i=0; i<str.length(); ++i) {
			System.out.print(num[i]);
		}
	}
}
