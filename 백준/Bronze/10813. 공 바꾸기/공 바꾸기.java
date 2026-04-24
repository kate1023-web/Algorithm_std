import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int length = sc.nextInt();
     int[] num = new int[length];
     int n = sc.nextInt();
     int ball = 1;

     for(int i=0; i<num.length; ++i) {
    	 num[i] = ball;
    	 ball++;
     }
     int cnt = 0;
     while(cnt<n) {
         int a = sc.nextInt();
         int b = sc.nextInt();

         int tmp = num[a-1];
         num[a-1] = num[b-1];
         num[b-1] = tmp;

        cnt++;
      }

     for(int i=0; i< num.length; ++i) {
            System.out.print(num[i]+" ");
     	}
    }
}

