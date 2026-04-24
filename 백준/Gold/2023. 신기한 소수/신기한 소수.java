import java.util.Scanner;

public class Main {
	public static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		DFS(2, 1);
		DFS(3, 1);
		DFS(5, 1);
		DFS(7, 1);
	}
	static void DFS(int num, int digit) {
		if(digit == n) {
			if(isprime(num)) {
				System.out.println(num);
			}
			return;
		}
		for(int i=1; i<10; i+=2) {
			if(isprime(num*10+i)) {
				DFS(num*10+i, digit+1);
			}
		}
	}
	static boolean isprime(int num) {
	    for (int i = 2; i <= num / 2; i++)
	      if (num % i == 0)
	        return false;
	    return true;
	  }
}
