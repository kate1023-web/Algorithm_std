import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int n = sc.nextInt();
    	String str = null;
    	if(n>10) {
    		if(num == 0) str = "0";
    		while(num!=0) {
    			if(str == null) {
    				if(num%n > 9) {
    					str = (char)(num%n+55)+"";
    				}
    				else {
    					str = (char)(num%n+48)+"";
    				}
    			}
    			else {
    				if(num%n > 9) {
    					str = (char)(num%n+55)+str;
    				}
    				else {
    					str = (char)(num%n+48)+str;
    				}
    			}
    			num = num/n;
    		}
    	}
    	else {
    		if(num == 0) str = "0";
    		while(num!=0) {
    			if(str==null) {
    				str = (char)(num%n+48)+"";
    			}
    			else {
    				str = (char)(num%n+48)+str;
    			}
        		num = num/n;
    		}
    		
    	}
    	System.out.print(str);
    }
}