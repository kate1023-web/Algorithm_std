import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minus = new PriorityQueue<>();
		int cnt0 = 0;
		int cnt1 = 0;
		for(int i=0; i<n; ++i) {
			int data = sc.nextInt();
			if(data == 1) {
				cnt1++;
			}
			else if (data == 0) {
				cnt0++;
			}
			else if (data>1) {
				plus.add(data);
			}
			else {
				minus.add(data);
			}
		}
		int sum = 0;
		
		while(plus.size()>1) {
			int data1 = plus.remove();
			int data2 = plus.remove();
			sum += data1*data2;
		}
		if(!plus.isEmpty()) {
			sum+=plus.remove();
		}
		
		while(minus.size()>1) {
			int data1 = minus.remove();
			int data2 = minus.remove();
			sum += data1*data2;
		}
		if(!minus.isEmpty()) {
			if(cnt0 == 0) {
				sum+=minus.remove();
			}
		}
		
		sum += cnt1;
		System.out.println(sum);
	}
}
