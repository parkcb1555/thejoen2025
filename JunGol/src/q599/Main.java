package q599;
//import java.util.*;
//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next().toUpperCase();
//		String result="";
//		for(int i=0;i<str.length();i++) {
//			char ch = str.charAt(i);			
//			System.out.println(ch);
//			int asc = (byte)ch;
//			System.out.println(asc);
//			if(asc>=65 && asc<=90) {
//				result = result+ch;	
//			}else if(asc>=97 && asc<=122){
//				result = result+ch;
//			}
//			
//			System.out.println();
//			
//		}
//		System.out.println(result);
//		
//		
//		sc.close();
//		
//	}
//
//}
import java.util.*;
public class Main{

     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         String temp = sc.next();
       
         for(int i = 0;i<temp.length();i++){
             char  c = temp.charAt(i);
             if(c>= 'a' && c <='z')
                 System.out.print((char)((c-'a')+'A'));
             if(c>= 'A' && c <='Z')
                 System.out.print(c);
         }
         sc.close();
    }

   }
