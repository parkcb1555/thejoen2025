package q557;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		char c[] = new char[10];
		
		
		for(int i=0;i<c.length;i++) {
			c[i] = sc.next().charAt(0);
			
		}
		
		for(int i=0;i<c.length;i++) {
			if(i==0 || i==3 || i==6) {
				System.out.print(c[i]+" ");
			}
		}
		
		System.out.println();
		
		for(int i=0;i<c.length;i++) {
			if(i%2 != 0) {
				System.out.print(c[i]+" ");
			}
		}
		
		System.out.println();
		
		for(int i=0;i<c.length;i++) {
			if(i%2 == 0) {
				System.out.print(c[i]+" ");
			}
		}
		
	}

}
