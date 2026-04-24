//브루트포스
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int cnt = 0, mnum = num;
    	while(cnt<num) {
    		int sum=0;
    		int n = num-cnt;
    		sum += n;
    		while(n>0) {
    			sum += n%10;
    			n = n/10;
    		}
    		if(num == sum && mnum > num-cnt) {
    			mnum = num-cnt;
    		}
    		cnt++;
    	}
    	if(mnum == num) {
    		System.out.println("0");
    	}
    	else {
    		System.out.println(mnum);
    	}
    	
    }
}