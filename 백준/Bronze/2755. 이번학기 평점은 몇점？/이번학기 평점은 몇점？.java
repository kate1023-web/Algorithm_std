import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt;
		
		cnt = sc.nextInt();
		
		String[][] str = new String[cnt][3];
		
		for(int i=0;i<cnt; ++i) {
			for(int j=0; j<str[i].length;++j) {
				str[i][j] = sc.next();
			}
		}
		
		double sum = 0;
		int grade = 0;
		
		for(int i=0; i<cnt; ++i) {
			grade += Integer.parseInt(str[i][1]);
			
			switch (str[i][2]) {
			case "A+":
				sum += (Integer.parseInt(str[i][1])*4.3);
				break;
			case "A0":
				sum += (Integer.parseInt(str[i][1])*4.0);
				break;
			case "A-":
				sum += (Integer.parseInt(str[i][1])*3.7);
				break;
			case "B+":
				sum += (Integer.parseInt(str[i][1])*3.3);
				break;
			case "B0":
				sum += (Integer.parseInt(str[i][1])*3.0);
				break;
			case "B-":
				sum += (Integer.parseInt(str[i][1])*2.7);
				break;
			case "C+":
				sum += (Integer.parseInt(str[i][1])*2.3);
				break;
			case "C0":
				sum += (Integer.parseInt(str[i][1])*2.0);
				break;
			case "C-":
				sum += (Integer.parseInt(str[i][1])*1.7);
				break;
			case "D+":
				sum += (Integer.parseInt(str[i][1])*1.3);
				break;
			case "D0":
				sum += (Integer.parseInt(str[i][1])*1.0);
				break;
			case "D-":
				sum += (Integer.parseInt(str[i][1])*0.7);
				break;
			case "F":
				sum += (Integer.parseInt(str[i][1])*0.0);
				break;
			default:
				break;
			}
		}
		System.out.printf("%.2f",(double)(sum/grade));
		
	}
}