import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<cNode>[] num;
	static long lcm;
	static long D[];
	static boolean vis[];
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n  = sc.nextInt();
		num = new ArrayList[n];
		vis = new boolean[n];
		D = new long[n];
		lcm = 1;
		for(int i=0; i<n; i++) {
			num[i] = new ArrayList<cNode>();
		}
		for(int i=0; i<n-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int p = sc.nextInt();
			int q = sc.nextInt();
			num[a].add(new cNode(b, p, q));
			num[b].add(new cNode(a, q, p));
			lcm *= (p*q / gcd(p, q));
		}
		D[0] = lcm;
		DFS(0);
		long mgcd = D[0];
		for(int i=1; i<n; i++) {
			mgcd = gcd(mgcd, D[i]);
		}
		for(int i=0; i<n; i++) {
			System.out.print(D[i]/mgcd+" ");
		}
		
	}
	public static long gcd(long a, long b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
	public static void DFS(int n) {
		vis[n] = true;
		for(cNode i: num[n]) {
			int next = i.getB();
			if(!vis[next]) {
				D[next] = D[n] * i.getQ() / i.getP();
				DFS(next);
			}
		}
	}
}

class cNode {
	int b;
	int p;
	int q;
	public cNode(int b, int p, int q) {
		super();
		this.b = b;
		this.p = p;
		this.q = q;
	}
	
	public int getB() {
		return b;
	}
	
	public int getP() {
		return p;
	}
	
	public int getQ() {
		return q;
	}
}
