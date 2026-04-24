//브루트포스
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int m = sc.nextInt();
    	int n = sc.nextInt();
    	char[][] chess = new char[m][n];
    	int num = 64;
    	
    	for(int i=0; i<chess.length; ++i) {
    		String str = sc.next();
    		for(int j=0; j<chess[i].length; ++j) {
    			chess[i][j] = str.charAt(j);
    		}
    	}
    	int cnt=0;
    	for(int i=0; i<chess.length;++i) {
    		for(int j=0; j<chess[i].length; ++j) {
    			if(i+7 < chess.length && j+7 < chess[i].length) {
    				cnt++;
    				int re =0, re2=0;
    				boolean color = false; //false면 W
    				char col = 'W';
    				for(int x =0; x<8; ++x) {
    					for(int y = 0; y<8; ++y) {
    						 if(color) {
    		                      col = 'B';
    		                   }
    		                   else {
    		                      col = 'W';
    		                   }
    						if(chess[i+x][j+y] != col) {
    							re++;
    						}
    						color = !color;
    					}
    					color=!color;
    				}
    				col = 'B';
    				color = true;
    				for(int x =0; x<8; ++x) {
    					for(int y = 0; y<8; ++y) {
    						 if(color) {
    		                      col = 'B';
    		                   }
    		                   else {
    		                      col = 'W';
    		                   }
    						if(chess[i+x][j+y] != col) {
    							re2++;
    						}
    						color = !color;
    					}
    					color=!color;
    				}
    				if(re>re2) {
    					re=re2;
    				}
    				if(num>re) {
    					num = re;
    				}
    				re=0;re2=0;
    			}
    		}
    	}
    	System.out.println(num);
    }
}