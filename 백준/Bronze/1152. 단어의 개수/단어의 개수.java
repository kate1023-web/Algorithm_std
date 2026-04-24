import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.nextLine();
    	int cnt = 0;
    	
    	for(int i=0; i<str.length();++i) {
    		if(str.charAt(i) == ' ' && i != 0 && i != str.length()-1) {
    			cnt++;
    		}
    	}
    	if(str.equals(" ")) {
    		System.out.println(cnt);
    	}
    	else {
    		System.out.print(cnt+1);
    	}
    }
}