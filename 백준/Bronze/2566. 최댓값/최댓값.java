import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[][] num = new int[9][9];
    	int x=0, y=0, max=0;
    	for(int i=0; i<9;++i) {
    		for(int j=0; j<9;++j) {
    			num[i][j] = sc.nextInt();
    			if(num[i][j]>=max) {
    				max=num[i][j];
    				x=i+1;
    				y=j+1;
    			}
    		}
    	}
    	System.out.println(max);
    	System.out.print(x+" "+y);
    }
}