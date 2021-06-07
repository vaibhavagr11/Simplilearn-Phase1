package June4;

interface Drawable{
	int salary = 100;
	void draw();
	void show();
}

interface Shape{
	int salary = 200;
	void shape();
	void show();
}

interface Demo extends Shape{
}


public class InterfaceExample implements Shape, Drawable {
    
	int salary = 900;
	
	public void show() {
		System.out.println("Inside show()");
	}
	
	@Override
	public void draw() {
		System.out.println("Inside draw");
	}
	
	@Override
	public void shape() {
		System.out.println("inside shape");
	}
	
	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample();
		obj.shape();
		obj.show();
		obj.draw();
		
		Shape d = new InterfaceExample();
		System.out.println(d.salary);
		System.out.println("salary "+obj.salary);

	}

}