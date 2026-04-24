import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int sec = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Deque<Node> mydeque = new LinkedList<>();
		for(int i=0; i<n; ++i) {
			int num = Integer.parseInt(st.nextToken());
			
			while(!mydeque.isEmpty() && mydeque.getLast().value > num) {
				mydeque.removeLast();
			}
			
			mydeque.addLast(new Node(num, i));
			
			while(!mydeque.isEmpty() && mydeque.getFirst().index <= i-sec) mydeque.removeFirst();
			
			sb.append(mydeque.getFirst().value).append(' ');
		}
		System.out.println(sb);
	}
}
