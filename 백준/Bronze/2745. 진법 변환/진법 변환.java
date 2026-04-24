import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.next();
    	int[] num = new int[str.length()];
    	int n = sc.nextInt();
    	for(int i=0; i<str.length();++i) {
    		if(str.charAt(i)-55>2) {
    			num[i] = str.charAt(i)-55;
    		}
    		else {
    			num[i] = str.charAt(i)-48;
    		}
    	}
    	int cnt=0, sum=0;
    	for(int i=str.length()-1; i>=0; --i) {
    		sum += num[i]*Math.pow(n,cnt);
    		cnt++;
    	}
    	System.out.println(sum);
    }
}