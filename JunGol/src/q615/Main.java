package q615;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//클래스 배열 형식
		Student[] arr1 = new Student[2];
		for(int i=0;i<arr1.length;i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			
			arr1[i] = new Student(name, kor, eng);
		}

		int korsum=0;
		int engsum=0;
		for(int i=0;i<arr1.length;i++) {
			arr1[i].print();
			korsum+=arr1[i].getKor();
			engsum+=arr1[i].getEng();
		}
		
		System.out.println("avg "+korsum/arr1.length+" "+engsum/arr1.length);
		
		
	}

}

class Student{
	String name;
	int kor;
	int eng;
	
	
	public Student(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	public void print() {
		System.out.println(this.name+" "+this.kor+" "+this.eng);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	
}