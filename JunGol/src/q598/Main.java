package q598;

import java.util.Scanner;
import java.lang.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

	
		while(true) {
			String str = sc.next();
			char ch = str.charAt(0);
			
//			
//			if('A' <= ch && ch <= 'Z') {
//				System.out.println(ch);
//				
//			}else if('a' <= ch && ch <= 'z'){
//				System.out.println(ch);	
//			}else if('0' <= ch && ch <= '9') {
//				System.out.printf("%d\n",(int)ch);	
//			}
//			else {
//				break;
//			}
			
			if(Character.isLetter(ch)) {
				System.out.println(ch);
			}else if(Character.isDigit(ch)) {
				System.out.println((int)ch);
			}else {
				break;
			}
			
			
		}
		
		
		
		
	}

}
