//정렬
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] c = new char[str.length()];
        for(int i=0; i<c.length;++i) {
        	c[i] = str.charAt(i);
        }
        Arrays.sort(c);
        for(int i=c.length-1; i>=0; --i) {
        	System.out.print(c[i]);
        }
    }
}