import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int cnt = 0;
    	while(cnt<num) {
    		int n = sc.nextInt();
    		String str = sc.next();
    		char[] c = new char[str.length()];
    		for(int i=0; i<c.length; ++i) {
    			c[i] = str.charAt(i);
    		}
    		for(int i=0; i<c.length;++i) {
    			for(int j=0; j<n;++j) {
    				System.out.print(c[i]);
    			}
    		}
    		if(cnt!=num-1) {
    			System.out.println();
    		}
    		cnt++;
    	}
    }
}