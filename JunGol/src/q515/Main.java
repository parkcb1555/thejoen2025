package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println(n1+" * "+n2+" = "+n1*n2);
		System.out.println(n1+" / "+n2+" = "+n1/n2);
		
		System.out.println();
		
		//printf
		System.out.printf("%d * %d = %d\n",n1,n2,n1*n2);
		System.out.printf("%d / %d = %d\n",n1,n2,n1/n2);
		
	}

}