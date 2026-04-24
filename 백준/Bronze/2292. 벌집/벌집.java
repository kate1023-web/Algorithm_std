import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int cnt = 1, sum=1;
    	while(sum<num) {
    		sum += cnt*6;
    		cnt++;
    	}
    	System.out.print(cnt);
    }
}