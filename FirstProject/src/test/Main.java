package test;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.Reader;
//import java.util.Scanner;
//
//
////import IOException;
//
//public class Main {
//	public static void main(String[] args) throws IOException{
////		InputStreamReader in = new InputStreamReader(System.in);
////		BufferedReader br = new BufferedReader(in);
////		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
////
////
////		String s = br.readLine(); // bufferedwriter 의 기본형은 String
////			
////		int i = Integer.parseInt(s) +10; // String 을 int로 형변환 후 +10 !!
////			
////		br.close(); // bufferedreader 도 입력을 마쳤다면 닫아주자
////			
////		bw.write("입력받은 값 : "+ s); // 출력
////		bw.newLine(); // 개행 메소드
////		bw.write("입력받은 값 +10 : "+i+"\n"); // 이렇게 하니까 제대로 출력됨
////
////		bw.flush(); // 남은 값 출력 && 버퍼 초기화
////		bw.close(); // bufferedwriter 닫기
////		
//		
//        Scanner sc = new Scanner(System.in);
//		
//
//		int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        Boolean b1 = (a != 0) ? true : false;
//        Boolean b2 = (b != 0) ? true : false;
//        
//        
//        System.out.println(((a != 0) ? 1 : 0)+" "+((b != 0) ? 1 : 0));
//        System.out.println();
//        System.out.println("[JAVA]");
//        System.out.println(b1+" "+b2);
//	}
//}
//
//
//
//
//
//
//
//
////백준 문제 풀이
////
////백준
////
////프로그래밍기본
////
//
//
////3040
//
////2292 
//
////9012 
////2557
////2438 
////2439 
////2440 
////2441
////2445 
////10871 
////10039 
////3046
////1152 
////1193 
////8958 
////1110 
////3052 
////1913 
////10810 
////2720
////10828 
////18870 
////2738 
////2740 
////25304 
////18185 
////5086 
////11728 
////
////알고리즘기본
////1149 
////2638
////
////이상한문제
////1237
////11506
////10212
////15922
////12096

class Parent {
    int x = 100;
 
    Parent() {
        this(500);
    }
 
    Parent(int x) {
        this.x = x;
    }
 
    int getX() {
        return x;
    }
}
 
class Child extends Parent {
    int x = 4000;
    
    Child() {
        this(5000);
    }
 
    Child(int x) {
        this.x = x;
    }
}
 
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.getX());
    }
}

