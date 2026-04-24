//정렬
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int[] org = new int[num];
    	int[] srt = new int[num];
    	HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
    	int r = 0;
    	
    	for(int i=0; i<num;++i) {
    		org[i] = srt[i] = sc.nextInt();
    	}
    	
    	Arrays.sort(srt);
    	
    	for(int i=0; i< num; ++i) {
    		if(!rank.containsKey(srt[i])) {
    			rank.put(srt[i], r);
    			r++;
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<num; ++i) {
    		int rnk = rank.get(org[i]);
    		sb.append(rnk).append(' ');
    	}
    	
    	System.out.println(sb);
    }
}