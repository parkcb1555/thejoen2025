package InterfaceEx;

public class JetPlane extends Plane implements Flyable, Soundable {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Sounding");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Fling");
	}
	
	
}
