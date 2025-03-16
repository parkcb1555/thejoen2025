package StringEx;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "STRING";
		String str2 = "STRING";
	
		if(str1==str2) {
			System.out.println("EQUAL");
		}else {
			System.out.println("NOT EQUAL");

		}
		
		
		if(str1.equals(str2)) {
			System.out.println("EQUAL");
		}else {
			System.out.println("NOT EQUAL");

		}
		
		
		String str3 = new String("STRING");
		String str4 = new String("STRING");
	
		if(str3==str4) {
			System.out.println("EQUAL");
		}else {
			System.out.println("NOT EQUAL");

		}
		
		
		if(str3.equals(str4)) {
			System.out.println("EQUAL");
		}else {
			System.out.println("NOT EQUAL");

		}
		
	}
}
