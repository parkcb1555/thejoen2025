package q531;

import java.util.Scanner;


public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		if(weight<=50.80) {
			System.out.println("Flyweight");
		}else if(50.80<weight && weight<=61.23) {
			
			System.out.println("Lightweight");
		}
			
		else if(61.23<weight && weight<=72.57) {
			System.out.println("Middleweight");
		}
			
		else if(72.57<weight && weight<=88.45) {
			
			System.out.println("Cruiserweight");
		}
		else if(88.45<weight) {
			
			System.out.println("Heavyweight");
		}
			
	}
}


