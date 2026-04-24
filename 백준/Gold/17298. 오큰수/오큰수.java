import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		int[] res = new int[n];
		String[] str = br.readLine().split(" ");
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<n; ++i) {
			num[i] = Integer.parseInt(str[i]);
		}
		st.push(0);
		for(int i=0; i<n; ++i) {
			while(!st.isEmpty() && num[st.peek()] < num[i]) {
				res[st.pop()] = num[i];
			}
			st.push(i);
		}
		while(!st.empty()) {
			res[st.pop()] = -1;
		}
		for(int i=0; i<n;++i) {
			bw.write(res[i]+" ");
		}
		bw.write("\n");
		bw.flush();
	}
}
