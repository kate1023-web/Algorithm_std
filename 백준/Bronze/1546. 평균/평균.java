import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, sum=0;
		int cnt;
		
		cnt = sc.nextInt();
		double[] n = new double[cnt];
		
		for(int i=0; i<cnt;++i) {
			n[i] = sc.nextDouble();
		}
		num=n[0];
		for(int i=1; i<cnt;++i) {
			if(num < n[i]) {
				num=n[i];
			}
		}
		for(int i=0; i<cnt;++i) {
			n[i]=n[i]/num*100;
			
		}
		
		for(int i=0; i<cnt;++i) {
			sum += n[i];
			
		}
		
		System.out.println(sum/cnt);
	}
}