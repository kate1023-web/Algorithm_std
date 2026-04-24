import java.util.Scanner;

public class Main {
	static int con[];
	static int mcon[];
	static int cnt;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sec = sc.nextInt();
		String str = sc.next();
		char[] ch = new char[n];
		con = new int[4];
		mcon = new int[4];
		cnt = 0;
		int cnt2=0;
		for(int i=0; i<4; ++i) {
			con[i] = sc.nextInt();
			if(con[i] == 0) cnt++;
		}
		for(int i=0; i<n; ++i) {
			ch[i] = str.charAt(i);
		}
		
		for(int i=0; i<sec; ++i) {
			Add(ch[i]);
		}
		
		if(cnt == 4) cnt2++;
		
		for(int i = sec; i<n; ++i) {
			int j = i - sec;
			Add(ch[i]);
			Remove(ch[j]);
			if(cnt == 4) cnt2++;
		}
		System.out.println(cnt2);
	}
	
	public static void Add(char c) {
		switch (c) {
		case 'A':
			mcon[0]++;
			if(mcon[0] == con[0]) cnt++;
			break;
		case 'C':
			mcon[1]++;
			if(mcon[1] == con[1]) cnt++;
			break;
		case 'G':
			mcon[2]++;
			if(mcon[2] == con[2]) cnt++;
			break;
		case 'T':
			mcon[3]++;
			if(mcon[3] == con[3]) cnt++;
			break;
		default:
			break;
		}
	}
	
	public static void Remove(char c ) {
		switch (c) {
		case 'A':
			if(mcon[0] == con[0]) cnt--;
			mcon[0]--;
			break;
		case 'C':
			if(mcon[1] == con[1]) cnt--;
			mcon[1]--;
			break;
		case 'G':
			if(mcon[2] == con[2]) cnt--;
			mcon[2]--;
			break;
		case 'T':
			if(mcon[3] == con[3]) cnt--;
			mcon[3]--;
			break;
		default:
			break;
		}
	}
}
