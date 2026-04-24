import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int cnt=0;
    	for(int i=0; i<str.length();++i) {
    		if(str.charAt(i) == 'A'||str.charAt(i) == 'B'||str.charAt(i) == 'C') {
    			cnt += 3;
    		}
    		else if(str.charAt(i) == 'D'||str.charAt(i) == 'E'||str.charAt(i) == 'F') {
    			cnt += 4;
    		}
    		else if(str.charAt(i) == 'G'||str.charAt(i) == 'H'||str.charAt(i) == 'I') {
    			cnt += 5;
    		}
    		else if(str.charAt(i) == 'J'||str.charAt(i) == 'K'||str.charAt(i) == 'L') {
    			cnt += 6;
    		}
    		else if(str.charAt(i) == 'M'||str.charAt(i) == 'N'||str.charAt(i) == 'O') {
    			cnt += 7;
    		}
    		else if(str.charAt(i) == 'P'||str.charAt(i) == 'Q'||
    				str.charAt(i) == 'R'||str.charAt(i) == 'S') {
    			cnt += 8;
    		}
    		else if(str.charAt(i) == 'T'||str.charAt(i) == 'U'||str.charAt(i) == 'V') {
    			cnt += 9;
    		}
    		else if(str.charAt(i) == 'W'||str.charAt(i) == 'X'||
    				str.charAt(i) == 'Y'||str.charAt(i) == 'Z') {
    			cnt += 10;
    		}
    	}
    	System.out.print(cnt);
    	
    }
}