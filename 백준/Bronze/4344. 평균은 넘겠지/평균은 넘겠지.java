import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts=0;
		int sum=0;
		int avsum=0;
		
		ts = sc.nextInt();
		
		int[][] grade = new int[ts][];
		double[] avg = new double[ts];
		
		for(int i=0; i<ts; ++i) {
			int length = sc.nextInt();
			grade[i] = new int[length];
			for(int j=0; j<grade[i].length; ++j) {
				grade[i][j] = sc.nextInt();
				sum += grade[i][j];
			}
			avg[i]=(double)sum/length;
			for(int j = 0; j<grade[i].length;++j) {
				if(grade[i][j] > avg[i]) {
					avsum++;
				}
			}
			//double per = (double)(avsum/grade[i].length);
			System.out.printf("%.3f%%\n", (double)avsum/grade[i].length*100);
			avsum=0;
			sum=0;
		}
		
		
	}
}