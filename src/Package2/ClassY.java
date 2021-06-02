package Package2;
import Package1.*;

public class ClassY extends ClassN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassY ob1=new ClassY();
		
		ob1.methodPublic();
		ob1.methodProtected();
		ob1.printDefault();
		ob1.printPrivate();
		
		ClassM ob2=new ClassM();
		ob2.methodPublic();
		ob2.printProtected();
		ob2.printDefault();
		ob2.printPrivate();
		
		ClassX ob3=new ClassX();
		//System.out.println(ob3.i3);
		System.out.println(ob3.l3);
		System.out.println(ob3.f3);
		System.out.println(ob3.c3);
		System.out.println(ob3.printPrivate());
		
		
		
		
		

	}

}
