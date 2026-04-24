//정렬
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	String[] st = new String[num];
    	for(int i=0; i<st.length;++i) {
    		st[i] = sc.next();
    	}
    	
    	Set<String> str = new HashSet<>(Arrays.asList(st));
        String[] std = str.toArray(new String[0]);
    	
    	Arrays.sort(std, new Comparator<String>() {
    		@Override
    		public int compare(String s1, String s2) {
    			return s1.length() - s2.length();
    		}
    	});

    	Arrays.sort(std, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                return s1.compareTo(s2);
            }
            return 0;
        });
    	
    	for(int i=0; i<std.length;++i) {
    		System.out.println(std[i]);
    	}
    	
    }
}