import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] num;
	static boolean vis[];
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int cnt = 0;
		num = new ArrayList[n+1];
		vis = new boolean[n+1];
		for(int i=1; i<n+1; ++i) {
			num[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<e; ++i) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			num[start].add(end);
			num[end].add(start);
		}
		for(int i=1; i<n+1; ++i) {
			if(!vis[i]) {
				cnt++;
				DFS(i);
			}
		}
		System.out.println(cnt);
	}
	
	public static void DFS(int v) {
			if(vis[v]) {
				return;
			}
			vis[v] = true;
			for(int i : num[v]) {
				if(vis[i] == false) DFS(i);
			}
 	}
}
