import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int[] num, tmp;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		num = new int[n+1];
		tmp = new int[n+1];
		for(int i=1; i<=n; ++i) {
			num[i] = Integer.parseInt(br.readLine());
		}
		mergesort(1, n);
		for(int i=1; i<=n; ++i) {
			bw.write(num[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void mergesort(int s, int e) {
		if (e-s < 1) return;
		int m = s+(e-s)/2;
		
		mergesort(s, m);
		mergesort(m+1, e);
		
		for(int i=s; i<=e; ++i) {
			tmp[i] = num[i];
		}
		int idx1= s;
		int idx2 = m+1;
		int k = s;
		while(idx1<=m && idx2<=e) {
			if(tmp[idx1] > tmp[idx2]) {
				num[k] = tmp[idx2];
				idx2++;
				k++;
			}
			else {
				num[k] = tmp[idx1];
				idx1++;
				k++;
			}
		}
		while(idx1<=m) {
			num[k] = tmp[idx1];
			k++;
			idx1++;
		}
		while(idx2 <= e) {
			num[k] = tmp[idx2];
			k++;
			idx2++;
		}
	}
}
