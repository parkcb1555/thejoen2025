package q9108;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			char ch = sc.next().charAt(0);
			
			str += ch;
			if(ch == '0') {
				break;
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i)+" -> "+(int)str.charAt(i));
		}
		
		sc.close();
		
	}

}
