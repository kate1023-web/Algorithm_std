import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer>[] num;
	static boolean vis[];
	static boolean rel;
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		rel = false;
		num = new ArrayList[n];
		vis = new boolean[n];
		for(int i=0; i<n; i++) {
			num[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<e; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			num[start].add(end);
			num[end].add(start);
		}
		for(int i=0; i<n; i++) {
			DFS(i, 1);
			if(rel) 
				break;
		}
		
		if(rel) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
	
	public static void DFS(int v, int depth) {
		if(depth == 5 || rel) {
			rel = true;
			return;
		}
		vis[v] = true;
		for(int i : num[v]) {
			if(!vis[i]) {
				DFS(i, depth+1);
			}
		}
		vis[v] = false;
 	}
}
