import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double gsum=0, gasum=0;
    	int cnt=0;
    	while(sc.hasNext()) {
    		String name = sc.next();
    		double grade = sc.nextDouble();
    		String record = sc.next();
    		if(record.equals("A+")) {
    			gsum += grade;
    			gasum += (grade*4.5);
    		}
    		else if(record.equals("A0")) {
    			gsum += grade;
    			gasum += (grade*4.0);
    		}
    		else if(record.equals("B+")) {
    			gsum += grade;
    			gasum += (grade*3.5);
    		}
    		else if(record.equals("B0")) {
    			gsum += grade;
    			gasum += (grade*3.0);
    		}
    		else if(record.equals("C+")) {
    			gsum += grade;
    			gasum += (grade*2.5);
    		}
    		else if(record.equals("C0")) {
    			gsum += grade;
    			gasum += (grade*2.0);
    		}
    		else if(record.equals("D+")) {
    			gsum += grade;
    			gasum += (grade*1.5);
    		}
    		else if(record.equals("D0")) {
    			gsum += grade;
    			gasum += (grade*1.0);
    		}
    		else if(record.equals("F")) {
    			gsum += grade;
    			gasum += (grade*0);
    		}
    		else if(record.equals("P")) {
    			//gsum += grade;
    		}
    		cnt++;
    	}
    	System.out.print(gasum/gsum);
    }
}