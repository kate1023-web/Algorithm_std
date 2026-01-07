import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int v = 1;
		int h = 1;
		
		int vm = 4;
		int hm = 2;
		
		int cnt = 1;
		
		while(v <= num || h <= num) {
			if(num == 1) {
				System.out.println("1/1");
				break;
			}
			else if(h == num) {
				System.out.println(cnt+"/1");
				break;
			}
			else if(v == num) {
				System.out.println("1/"+cnt);
				break;
			}
			
			if(cnt%2 == 1) {
				v++;
				h = h + hm;
				hm +=4;
			}
			else {
				v = v + vm;
				h++;
				vm +=4;
			}
			cnt++;
		}
		
		
		if (num != v && num != h) {
			if(cnt%2 == 1) {
				v = v - vm + 4;
			}
			else {
				v--;
			}
			
			if(num > v) {
				int s = 1+(num-v);
				int m = cnt - (num-v) - 1;
				System.out.println(s+"/"+m);
			}
			else {
				int s = 1 + (v-num);
				int m = cnt - (v-num) - 1;
				System.out.println(s+"/"+m);
			}
		}
	}
}
