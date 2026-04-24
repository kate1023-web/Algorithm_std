import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int[] c = new int[26];
    	for(int i=0; i<c.length;++i) {
    		c[i] = 0;
    	}
    	for(int i=0; i<str.length();++i) {
    		if(str.charAt(i)-'a'<0) {
    			c[str.charAt(i)-'A']++;
    		}
    		else {
    			c[str.charAt(i)-'a']++;
    		}
    	}
    	int max=0, both = 0;
    	for(int i=0; i<c.length;++i) {
    		if(c[i]>max) max = c[i];
    	}
    	for(int i=0; i<c.length;++i) {
    		if(c[i]==max) both++;
    	}
    	if(both>1) {
    		System.out.print("?");
    	}
    	else {
    		for(int i=0; i<c.length;++i) {
    			if(c[i]==max) {
    				System.out.print((char)(i+'A'));
    			}
    		}
    	}
    }
}