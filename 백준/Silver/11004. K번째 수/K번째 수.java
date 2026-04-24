import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int[] num = new int[n];
		for(int i=0 ; i<n; ++i) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		Quicksort(num, 0, n-1, k-1);
		System.out.println(num[k-1]);
	}
	
	public static void Quicksort(int[] num, int s, int e, int k) {
		if(s<e) {
			int pivot = partition(num, s, e);
			if(pivot == k) 
				return;
			else if(pivot > k) 
				Quicksort(num, s, pivot-1, k);
			else if(pivot < k) 
				Quicksort(num, pivot+1, e, k);
		}
	}
	
	public static int partition(int[] num, int s, int e) {
		if(s+1 == e) {
			if(num[s] > num[e]) swap(num, s, e);
			return e;
		}
		int m = (s+e)/2;
		swap(num, s, m);
		int pivot = num[s];
		int i = s+1;
		int j = e;
		while(i<=j) {
			while(j>=s+1 && pivot < num[j]) {
				j--;
			}
			while(i<=e && pivot > num[i]) {
				i++;
			}
			if(i <= j) {
				swap(num, i++, j--);
			}
		}
		
		num[s] = num[j];
		num[j] = pivot;
		return j;
	}
	
	public static void swap(int[] num, int s, int e) {
		int tmp = num[e];
		num[e] = num[s];
		num[s] = tmp;
		
	}
}
