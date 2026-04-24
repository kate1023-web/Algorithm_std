import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		StringBuffer bf = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; ++i) {
			num[i] = sc.nextInt();
		}
		Stack<Integer> st = new Stack<>();
		boolean no = false;
		int cnt = 1;
		for(int i=0; i<n; ++i) {
			int com = num[i];
			if(com >= cnt) {
				while(com >= cnt) {
					st.push(cnt++);
					bf.append("+\n");
				}
				st.pop();
				bf.append("-\n");
			}
			else {
				int top = st.pop();
				
				if(top > com) {
					System.out.println("NO");
					no = true;
					break;
				}
				else {
					bf.append("-\n");
				}
				
			}
		}
		if(!no)System.out.println(bf.toString());
	}
}
