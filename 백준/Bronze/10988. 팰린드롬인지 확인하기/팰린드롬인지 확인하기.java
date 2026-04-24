import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	boolean p = true;
    	for(int i=0; i<str.length()/2;++i) {
    		if(str.charAt(i) != str.charAt(str.length()-i-1)) {
    			p = false;
    		}
    	}
    	if(p) {
    		System.out.print("1");
    	}
    	else System.out.print("0");
    }
}