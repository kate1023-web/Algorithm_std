//정렬
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	String[][] str = new String[num][2];
    	for(int i=0; i<num; ++i) {
    		str[i][0] = sc.next();
    		str[i][1] = sc.next();
    	}
    	
    	Arrays.sort(str, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return 0;
			} else {
				return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
			}
		});	
    	
    	for(int i=0; i<num; ++i) {
    		System.out.println(str[i][0]+" "+str[i][1]);
    	}
    	
    }
}