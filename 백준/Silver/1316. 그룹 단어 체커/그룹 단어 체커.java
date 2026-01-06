import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int word = 0;
		char eng = ' ';
		
		for(int i=0; i<cnt; ++i) {
			String str = sc.next();
			int[] num = new int[26];
			for(int j=0; j<str.length(); ++j) {
				if(j == 0)eng = str.charAt(j);
				else eng = str.charAt(j-1);
				num[str.charAt(j)-97] ++;
				if(num[str.charAt(j)-97] > 1 && eng != str.charAt(j)) break;
				else if(j == str.length()-1)word++;
			}
		}
		
		System.out.println(word);
	}
}
