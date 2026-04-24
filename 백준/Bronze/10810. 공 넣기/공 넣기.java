import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int length = sc.nextInt();
     int[] num = new int[length];
      int n = sc.nextInt();

      for(int i=0; i<num.length; ++i) {
          num[i] = 0;
       }
      int cnt = 0;
     while(cnt<n) {
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

         for(int i=a-1; i<b; i++) {
              num[i] = c;
         }

        cnt++;
      }

     for(int i=0; i< num.length; ++i) {
            System.out.print(num[i]+" ");
     }
    }
}

