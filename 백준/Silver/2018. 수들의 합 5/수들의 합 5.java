import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int stp = 1, enp = 1;
		int cnt = 1;
		int sum = 1;
		while (enp != num) {
			if (sum == num) {
				cnt++;
				enp++;
				sum += enp;
			}
			else if (sum < num) {
				enp++;
				sum += enp;
			}
			else {
				sum -= stp;
				stp++;
				
			}
		}
		System.out.println(cnt);
	}
}
