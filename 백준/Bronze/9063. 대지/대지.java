import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max_w = Integer.MIN_VALUE;
		int min_w = Integer.MAX_VALUE;
		
		int max_h = Integer.MIN_VALUE;
		int min_h = Integer.MAX_VALUE;
		
		int cnt = sc.nextInt();
		
		for(int i=1; i<=cnt; i++) {
			int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x > max_w) max_w = x;
		    if(x < min_w) min_w = x;
		    
		    if(y > max_h) max_h = y;
		    if(y < min_h) min_h = y;
		}
		
		System.out.println(((max_w - min_w)*(max_h - min_h)));
	}
}
