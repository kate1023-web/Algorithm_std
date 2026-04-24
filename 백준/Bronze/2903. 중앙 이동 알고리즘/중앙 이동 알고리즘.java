import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int cnt = sc.nextInt();
    	int rt = 2;
    	for(int i=0; i<cnt;++i) {
    		rt += Math.pow(2, i);
    	}
    	System.out.print(rt*rt);
    }
}