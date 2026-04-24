import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] num;
	static boolean vis[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		int s = sc.nextInt();
		num = new ArrayList[n+1];
		vis = new boolean[n+1];
		for(int i=1; i<=n; ++i) {
			num[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<e; ++i) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			num[start].add(end);
			num[end].add(start);
		}
		for(int i=1; i<=n; ++i) {
			Collections.sort(num[i]);
		}
		DFS(s);
		System.out.println();
		vis = new boolean[n+1];
		BFS(s);
		System.out.println();
	}
	
	static void DFS(int s) {
		System.out.print(s + " ");
		vis[s] = true;
		for(int i : num[s]) {
			if(vis[i] == false) DFS(i);
		}
	}
	
	static void BFS(int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		vis[s] = true;
		
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node + " ");
			for(int i : num[node]) {
				if(vis[i] == false) {
					vis[i] = true;
					q.add(i);
				}
			}
		}
	}
}
