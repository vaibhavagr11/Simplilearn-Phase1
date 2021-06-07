package June4;

abstract class Mnc{
	Mnc(){
		System.out.println("MNC is created");
		
	}
	void changeSharePrice(){
		System.out.println("MNC share price increased");
	}
	abstract void method1();
	abstract void method2();
		
	
}

abstract class Infosys extends Mnc{
	void method1() {
		System.out.println("2000 people hired");
	}
	
}

 class Hello extends Infosys{
	void method1() {
		System.out.println("500 people hired");
	}
	void method2() {
		System.out.println("200 people hired");
	}
	
	void normalMethod() {
		System.out.println("Hello from our side");
	}
	
}

public class AbstractionExample {

	public static void main(String[] args) {
		
			Infosys in= new Hello();
			in.method1();
			in.method2();
			in.changeSharePrice();
			
			
			Hello h=new Hello();
			h.normalMethod();
			//h.method1();
		

	}

}
