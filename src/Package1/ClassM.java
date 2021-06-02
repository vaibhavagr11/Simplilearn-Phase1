package Package1;

public class ClassM {
	
	protected float f= 103.45f;
	private int i=4;
	long l=456L;
	
	public void methodPublic(){
		System.out.println("Inside Public Method");
		
		
	}
	protected void methodProtected() {
		System.out.println("Inside Protected Method");
	}
	private void methodPrivate() {
		System.out.println("Inside Private method");
		
	}
	void methodDefault() {
		System.out.println("InsideDefault method");
		
	}
	public void print_var() {
		System.out.println(f);
		System.out.println(i);
		System.out.println(l);
	}
	public void printPrivate() {
		methodPrivate();
	}
	public void printProtected() {
		methodProtected();
	}
	public void printDefault() {
		methodDefault();
	}
	

}
