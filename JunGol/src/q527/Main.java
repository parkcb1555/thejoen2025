package q527;

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

		
        System.out.printf(n1/n2+" %.2f\n",(double)n1/n2);
        
        //소수점 둘째까지
        System.out.println(Math.round(((double)n1/n2)*100)/100.0);
        
        //소수점 셋째까지
        System.out.println(Math.round(((double)n1/n2)*1000)/1000.0);
	}
}

