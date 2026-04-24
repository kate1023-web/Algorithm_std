import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int tmpa = 0, tmpb = 0, num=100;
    	for(int i=0; i<3; ++i) {
    		tmpa += (a%10)*num;
    		tmpb += (b%10)*num;
    		a = a/10;
    		b = b/10;
    		num = num/10;
    	}
    	a = tmpa;
    	b = tmpb;
    	if(a>b) {
    		System.out.print(a);
    	}
    	else System.out.print(b);
    }
}