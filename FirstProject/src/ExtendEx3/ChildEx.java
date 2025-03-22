package ExtendEx3;

public class ChildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = new Parent();
		
		parent.method1();
		parent.method2();
		
		child.method1();
		child.method2();
		child.method3();
		
		
		System.out.println("--------------------------");
	
		parent  = child;
		parent.method1();
		parent.method2();
	}
}
