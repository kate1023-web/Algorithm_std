import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());
		int[] primes = new int[num];
		int cnt = 0;
		
		if(num == 1)return;
		
		for(int i=2; i*i<=num; ++i) {
			while(num%i == 0) {
				System.out.println(i);
				num = num/i;
			}
		}
		
		if(num > 1) System.out.println(num);
	}
}
