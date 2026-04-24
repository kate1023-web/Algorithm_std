import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	int[] num = new int[26];
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	char[] ch = new char[s.length()];
    	for(int i=0; i<ch.length;++i) {
    		ch[i] = s.charAt(i);
    	}
    	for(int i=0; i<num.length; ++i) {
    		num[i] = -1;
    	}
    	char c = 'a';
    	for(int i=0; i<ch.length;++i) {
    		for(int j=0; j<26; ++j) {
    			if(c+j == ch[i] && num[c+j-'a'] == -1) {
    				num[c+j-'a'] = i;
    			}
    		}
    	}
    	
    	for(int i=0; i<num.length; ++i) {
    		if(i== 25) {
    			System.out.print(num[i]);
    		}
    		else {
    			System.out.print(num[i]+" ");
    		}
    	}
    }
}