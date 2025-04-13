package q1856;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {		

				if(i%2 == 0) {
					System.out.print((m*i)+(j+1)+" ");
				}else {
					System.out.print((m*(i+1))-j+" ");
				}
				
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
