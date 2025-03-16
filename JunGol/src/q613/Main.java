package q613;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] students = new Student[2];
			
		for(int i=0;i<students.length;i++) {
			
		}
		
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		int classnum = sc.nextInt();
		
		Student student1 = new Student(name,school,grade,classnum);
		
		name = sc.next();
		school = sc.next();
		grade = sc.nextInt();
		classnum = sc.nextInt();
		
		Student student2 = new Student(name,school,grade,classnum);
		
		student1.print();
		System.out.println();
		student2.print();
	}

}

/*
 
Songjunhyuk Beolmal 6 5
Honggildong Seoul 3 4
 
 
 */

class Student{
	String name;
	String school;
	int grade;
	int classnum;
	


	Student(){
		
	}
	
	Student(String name, String school, int grade,int classnum){
		this.name = name;
		this.school = school;
		this.grade = grade;
		this.classnum = classnum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getClassnum() {
		return classnum;
	}

	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	
	
	public void print() {
		System.out.println("Name : "+name);
		System.out.println("School : "+school);
		System.out.println("Grade : "+grade);
		System.out.println("ClassNumber : "+classnum);
		
	}
	
}