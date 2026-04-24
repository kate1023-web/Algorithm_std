import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			int fa = Math.abs(o1);
			int sa = Math.abs(o2);
			if(fa == sa) {
				return o1 > o2 ? 1 :-1;
			}
			else {
				return fa - sa;
			}
		});
		
		for(int i=0; i<n; ++i) {
			int num = sc.nextInt();
			
			if(num == 0) {
				if(pq.isEmpty()) System.out.println("0");
				else System.out.println(pq.poll());
			}
			
			else {
				pq.add(num);
			}
		}
	}
}
