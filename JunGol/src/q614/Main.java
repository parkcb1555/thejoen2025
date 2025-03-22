package q614;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		School school1 = new School();
		school1.setName("Jejuelementary");
		school1.setGrade(6);
		
		
		
		String str = sc.next();
		int grade = sc.nextInt();
		School school2 = new School();
		school2.setName(str);
		school2.setGrade(grade);
		
		
		school1.print();
		school2.print();
		
//		//클래스 배열 형식
//		School[] arr1 = new School[2];
//		arr1[0] = new School("Jejuelementary", 6);
//		arr1[1] = new School(str, grade);
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i].print();
//		}
		
	}

}

/*
 
Songjunhyuk Beolmal 6 5
Honggildong Seoul 3 4
 
 
 */

class School{
	String name;
	int grade;
	
	School() {
		// TODO Auto-generated constructor stub
	}
	School(String name,int grade){
		this.grade = grade;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(this.grade+" grade in "+this.name+" School");
	}
}