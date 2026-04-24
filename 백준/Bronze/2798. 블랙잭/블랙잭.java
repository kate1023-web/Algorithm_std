import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	int[] sum = new int[num*(num-1)*(num-2)];
    	int max = sc.nextInt();
    	int cnt=0, numax=0;
    	int[] n = new int[num];
    	for(int i=0; i<n.length; ++i) {
    		n[i] = sc.nextInt();
    	}
    	
    	for(int i=0; i<n.length;++i) {
    		for(int j=i+1; j<n.length;++j) {
    			for(int k=j+1; k<n.length;++k) {
    				sum[cnt] = n[i]+n[j]+n[k];
    				cnt++;
    			}
    		}
    	}
    	
    	for(int i=0; i<sum.length;++i) {
    		if(max >= sum[i] && numax < sum[i]) {
    			numax = sum[i];
    		}
    	}
    	System.out.println(numax);
    }
}