package June4;

abstract class Pen {
	abstract void write();
	abstract void refill();
}

class Fountain extends Pen {

	@Override
	void write() {
		
		System.out.println(" writing...");
	}

	@Override
	void refill() {
		
		System.out.println("refilling...");
	}
	
	void changeNib() {
		System.out.println("Chnging the Nib");
	}
	
}

class Monkey {
	
	void jump() {
		System.out.println("Jumping....");
	}
	
	void bite() {
		System.out.println("Biting....");
	}
	
}

interface Animal {
	void eat();
	void sleep();
}

class Human extends Monkey implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating...");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping.... ");
	}
	
}

public class AssignmentMonkey {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m1 = new Human();
		
		m1.jump();
		m1.bite();
		
		
		Human h = new Human();
		h.jump();
		h.eat();
		h.sleep();
		
		Animal a = new Human();
			a.eat();
			a.sleep();
		
		
		
		Pen p1 = new Fountain();
		p1.write();
		p1.refill();
		
		
		Fountain f1 = new Fountain();
		f1.changeNib();

	}

}
