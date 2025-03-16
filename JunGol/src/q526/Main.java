package q526;

import java.util.Scanner;


public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		int x1 = (int)n1*(int)n2;
		double x2 = n1*n2;
		
        System.out.println((int)x2+" "+x1);
        
	}
}

