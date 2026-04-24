import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
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
			
			if(mydeque.getFirst().index <= i-sec) mydeque.removeFirst();
			
			bw.write(mydeque.getFirst().value + " ");
			
		}
		bw.flush();
		bw.close();
	}
	
	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}
