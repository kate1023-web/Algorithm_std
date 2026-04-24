import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int[][] num = new int[n][m];
    	
    	for(int i=0; i<2; ++i) {
    		for(int j=0; j<num.length;++j) {
    			for(int k=0; k<num[j].length;++k) {
    				num[j][k] += sc.nextInt();
    			}
    		}
    	}
    	
    	for(int i=0; i<num.length;++i) {
    		for(int j=0; j<num[i].length;++j) {
    			if(j==num[i].length-1) {
    				System.out.print(num[i][j]);
    			}
    			else {
    				System.out.print(num[i][j]+" ");
    			}
    		}
    		System.out.println();
    	}
    }
}