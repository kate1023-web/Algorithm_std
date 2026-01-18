import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] wlength = new int[1000];
		int[] ylength = new int[1000];
		
		for(int i=1; i<=6; ++i) {
			if(i%2 == 0) ylength[(sc.nextInt()-1)]++;
			else wlength[(sc.nextInt()-1)]++;
		}
		
		for(int i = 0; i<wlength.length; ++i) {
			if(wlength[i] == 1)System.out.print(i+1 + " ");
		}
		for(int i = 0; i<ylength.length; ++i) {
			if(ylength[i] == 1)System.out.println(i+1);
		}
	}
}