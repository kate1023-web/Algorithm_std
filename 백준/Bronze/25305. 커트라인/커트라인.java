//브루트포스
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int p = sc.nextInt();
    	int aw = sc.nextInt();
    	int[] num = new int[p];
    	
    	for(int i=0; i<num.length;++i) {
    		num[i] = sc.nextInt();
    	}
    	
    	for(int i=0; i<num.length;++i) {
    		for(int j=0; j<num.length;++j) {
    			if(num[i]>num[j]) {
    				int tmp = num[i];
    				num[i] = num[j];
    				num[j] = tmp;
    			}
    		}
    	}
    	System.out.println(num[aw-1]);
    }
}