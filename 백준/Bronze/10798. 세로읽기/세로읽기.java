import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[][] ch = new char[5][];
    	
    	for(int i=0; i<5;++i) {
    		String str = sc.next();
    		char[] c = new char[str.length()];
    		for(int j=0; j<str.length();++j) {
    			c[j] = str.charAt(j);
    		}
    		ch[i] = c;
    	}
    	
    	for(int i=0; i<15; ++i) {
    		for(int j=0; j<5;++j) {
    			if(i<ch[j].length) {
    				System.out.print(ch[j][i]);
    			}
    		}
    	}
    	
    }
}