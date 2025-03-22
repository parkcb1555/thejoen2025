package q555;

import java.util.*;


public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char[] c = new char[10];
        
        for(int i=0;i<c.length;i++) {
        	//엔터가 입력되면 다음으로 넘어감
        	String str = sc.next();
        	c[i] = str.charAt(0);
        	
        }
        
        for(int i=0;i<c.length;i++) {
        	System.out.print(c[i]);
        }
      
//        //입력 즉시 넘어감
//        String str2 = sc.nextLine();
//        System.out.println(str2);
        
        sc.close();
	}

}
