import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			if(num == -1)break;
			int[] m = new int[num];
			int sum = 0;
			int last = 0;
			for(int i=1; i<num; ++i) {
				if(num%i == 0) {
					sum += i;
					m[i-1] = 1;
					last = i;
				}
			}
			if(sum != num) System.out.println(num + " is NOT perfect.");
			else {
				System.out.print(num + " = ");
				for(int i=0; i< last; ++i) {
					if(m[i] == 1) {
						System.out.print(i+1);
						if(i != last-1) System.out.print(" + ");
					}
				}
				System.out.println();
			}
		}
	}
}
