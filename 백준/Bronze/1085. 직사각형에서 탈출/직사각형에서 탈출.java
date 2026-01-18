import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int wlength, hlength;
		
		if((w-x) > x) wlength = x;
		else wlength = (w-x);
		
		if((h-y) > y) hlength = y;
		else hlength = (h-y);
		
		if(wlength > hlength) System.out.println(hlength);
		else if(wlength < hlength) System.out.println(wlength);
		else System.out.println(wlength);
	}
}
