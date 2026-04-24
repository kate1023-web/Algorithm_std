import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int[] dep;
	static boolean[] vis;
	static ArrayList<Edge>[] num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		num = new ArrayList[n+1];
		dep = new int[n+1];
		vis = new boolean[n+1];
		for(int i=1; i<=n; ++i) {
			num[i] = new ArrayList<Edge>();
		}
		for(int i=0; i<n; ++i) {
			int start = sc.nextInt();
			while(true) {
				int end = sc.nextInt();
				if(end == -1) {
					break;
				}
				int len = sc.nextInt();
				num[start].add(new Edge(end, len));
			}
		}
		
		BFS(1);
		int max = 1;
		for(int i=2; i<=n; ++i) {
			if(dep[i] > dep[max]) {
				max = i;
			}
		}
		dep = new int[n+1];
		vis = new boolean[n+1];
		BFS(max);
		Arrays.sort(dep);
		System.out.println(dep[n]);
	}
	
	public static void BFS(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		vis[n] = true;
		while(!q.isEmpty()) {
			int now = q.poll();
			for(Edge i : num[now]) {
				int e = i.e;
				int v = i.val;
				if(!vis[e]) {
					vis[e] = true;
					q.add(e);
					dep[e] = dep[now] + v;
				}
			}
		}
	}
}

class Edge {
	int e;
	int val;
	
	public Edge(int e, int val) {
		this.e = e;
		this.val = val;
	}
}
