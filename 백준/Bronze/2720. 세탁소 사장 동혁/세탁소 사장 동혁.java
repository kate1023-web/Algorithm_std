import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int cnt = sc.nextInt();
    	for(int i=0; i<cnt; ++i) {
    		int mon = sc.nextInt();
    		System.out.print(mon/25+" ");
    		mon = mon%25;
    		System.out.print(mon/10+" ");
    		mon = mon%10;
    		System.out.print(mon/5+" ");
    		mon = mon%5;
    		System.out.print(mon/1);
    		mon = mon%1;
    		System.out.println();
    	}
    }
}