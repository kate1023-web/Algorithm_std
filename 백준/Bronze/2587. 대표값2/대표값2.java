//브루트포스
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] num = new int[5];
    	int sum = 0;
    	
    	for(int i=0; i<num.length; ++i) {
    		num[i] = sc.nextInt();
    	}
    	
    	for(int i=0; i<num.length;++i) {
    		for(int j=i; j<num.length; ++j) {
    			if(num[i] > num[j]) {
    				int tmp = num[i];
    				num[i] = num[j];
    				num[j] = tmp;
    			}
    		}
    		sum += num[i];
    	}
    	System.out.println(sum/5);
    	System.out.println(num[2]);
    }
}