import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] length = new int[3];
		
		while(true) {
			int max = -1;
			int max_num = 0;
			int sum = 0;
			for(int i=0; i<length.length; ++i) {
				length[i] = sc.nextInt();
				if(max < length[i]) {
					max = length[i];
					max_num = i;
				}
			}
			
			if(length[0] == 0 && length[1] == 0 && length[2] == 0)break;
			
			for(int i=0; i<=2; ++i) {
				if(i != max_num) sum += length[i];
			}
			
			if(max < sum && (length[0] == length[1] && length[1] == length[2] && length[0] == length[2])) System.out.println("Equilateral");
			else if(max < sum && ((length[0] == length[1] && length[0] != length[2]) || (length[1] == length[2] && length[1] != length[0]) || (length[0] == length[2] && length[0] != length[1]))) System.out.println("Isosceles");
			else if(max < sum && (length[0] != length[1] || length[1] != length[2] || length[0] != length[2])) System.out.println("Scalene");
			else if(max >= sum) System.out.println("Invalid");
		}
	}
}
