import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		num[] com = new num[n];
		for(int i=0; i<n; ++i) {
			com[i] = new num(Integer.parseInt(bf.readLine()), i); 
		}
		Arrays.sort(com);
		int max = 0;
		for(int i=0; i<n; ++i) {
			if(max < com[i].idx - i) max = com[i].idx - i;
		}
		System.out.println(max+1);
	}
}

class num implements Comparable<num> {
	int val;
	int idx;
	
	public num(int val, int idx) {
		this.val = val;
		this.idx = idx;
	}
	
	public int compareTo(num o) {
		return this.val - o.val;
	}
}
