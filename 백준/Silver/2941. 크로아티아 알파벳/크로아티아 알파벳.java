import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int cnt=0;
    	for(int i=0; i<str.length();++i) {
    		if(i+1<str.length()) {
    			if((str.charAt(i)=='c' && str.charAt(i+1)=='=') ||
    	    			str.charAt(i)=='c' && str.charAt(i+1)=='-') {
    	    			i++;
    					cnt++;
    	    		}
    	    		else if(str.charAt(i)=='d' && str.charAt(i+1)=='-') {
    	    			i++;
    					cnt++;
    	    		}
    	    		else if((str.charAt(i)=='l' && str.charAt(i+1)=='j') || 
    	    				(str.charAt(i)=='n' && str.charAt(i+1)=='j')) {
    	    			i++;
    					cnt++;
    	    		}
    	    		else if((str.charAt(i)=='s' && str.charAt(i+1)=='=') || 
    	    				(str.charAt(i)=='z' && str.charAt(i+1)=='=')) {
    	    			i++;
    					cnt++;
    	    		}
    	    		else if (i+2<str.length()) {
    	    			if (str.charAt(i)=='d'&& str.charAt(i+1)=='z' && str.charAt(i+2)=='=') {
    	    				i+=2;
    	    				cnt++;
    	    				}
    	    			else {
    	    				cnt++;
    	    			}
    	    		}
    	    		else {
    	    			cnt++;
    	    		}
    		}
    		else cnt++;
    	}
    	System.out.print(cnt);
    }
}