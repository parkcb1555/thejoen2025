package CarEx;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		mycar.setSpeed(-20);
		System.out.println("speed : "+mycar.getSpeed());
		
		mycar.setSpeed(40);
		System.out.println("speed : "+mycar.getSpeed());
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		System.out.println("speed : "+mycar.getSpeed());
	}

}
