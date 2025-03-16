package q115;

import java.util.Scanner;


public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int weight1 = sc.nextInt();
		int height1 = sc.nextInt();
		int weight2 = sc.nextInt();
		int height2 = sc.nextInt();
		
        System.out.print(((weight1>weight2) && (height1>height2)) ? 1: 0);
        
	}
}

