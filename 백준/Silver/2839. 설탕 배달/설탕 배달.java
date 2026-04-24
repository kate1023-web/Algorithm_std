//브루트포스
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int kg = sc.nextInt();
    	int cnt = 5000;
    	for(int i=0; i<5000;++i) {
    		for(int j=0; j<5000; ++j) {
    			if(kg == i*5+j*3 && cnt>i+j) {
    				cnt = i+j;
    			}
    			else if(kg == i*3+j*5 && cnt>i+j) {
    				cnt = i+j;
    			}
    		}
    	}
    	if(cnt == 5000) {
    		cnt = -1;
    	}
    	System.out.println(cnt);
    }
}