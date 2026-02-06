import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<=2; ++i) {
			num[i] = sc.nextInt();
			if(num[i] > max) max = num[i];
		}
		
		int sum = 0;
		
		for(int i=0; i<=2; ++i) {
			sum += num[i];
		}
		
		if((sum-max) <= max) sum = sum - max + (sum - max - 1);
		else if(num[0] == num[1] && num[1] == num[2] && num[0] == num[2]) sum = max*3;
		
		System.out.println(sum);
	}
}
