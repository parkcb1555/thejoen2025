package switch1;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int time = (int)(Math.random()*4)+8;
		
		System.out.println("time : "+time);
		
		switch (time) {
		case 8: {
			System.out.println("8");
		}
		case 9: {
			System.out.println("9");
		}
		case 10: {
			System.out.println("10");
		}
		default:
			System.out.println("Default");
		}
	}
}
