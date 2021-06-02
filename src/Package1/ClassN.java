package Package1;

public class ClassN {
	protected long l1=102344l;
	public int i1=56;
	double d1=324234.54543;
	
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
		System.out.println(l1);
		System.out.println(i1);
		System.out.println(d1);
	}
	public void printPrivate() {
		methodPrivate();
	}
	public void printDefault() {
		methodDefault();
		
	}
	public void printProtected() {
		methodProtected();
	}

}
