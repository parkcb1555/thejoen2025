package q596;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		int range;
		if(n>str.length()) {
			range = 0;
		}else {
			range = str.length()-n;
		}
		for(int i=str.length()-1;i>=range;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
