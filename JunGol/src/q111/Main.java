package q111;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int cm = sc.nextInt();

		int sum = kor+eng+math+cm;
		int avg = sum/4;
		
        System.out.println("sum "+sum+"\navg "+avg);
        
	}
}

