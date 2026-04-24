//정렬
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int[][] xy = new int[num][2];
    	
    	for(int i=0;i<num; ++i) {
    		xy[i][0] = sc.nextInt();
    		xy[i][1] = sc.nextInt();
    	}
    	Arrays.sort(xy, (e1, e2) -> {
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			} else {
				return e1[1] - e2[1];
			}
		});	
    	for(int i=0; i<num; ++i) {
    		System.out.println(xy[i][0]+" "+xy[i][1]);
    	}
    }
}