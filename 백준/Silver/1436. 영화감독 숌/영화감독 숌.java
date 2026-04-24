//브루트포스
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int cntn = 0, cnt=0, n=666;
    	int num = sc.nextInt();
    	while(true) {
    		String str = Integer.toString(n);
    		char[] c = new char[str.length()];
    		for(int i=0; i<c.length;++i) {
    			c[i] = str.charAt(i);
    		}
    		for(int i=0; i<c.length;++i) {
    			if(i+2<c.length) {
    				if(c[i] == '6' && c[i+1] == '6' && c[i+2] == '6') {
        				cnt++;
        				break;
        			}
    			}
    		}
    		if(cnt == num) {
    			break;
    		}
    		n++;
    	}
    	System.out.println(n);
    	
    }
}