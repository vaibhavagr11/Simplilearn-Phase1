package prolim.phase1.core;

 class AreaShape{
	int  length, breadth;
	float radius;
	int side;
	
	AreaShape(int l,int b){
		length=l;
		breadth=b;
		
	}
	AreaShape(){
		
	}
	AreaShape(float len){
		radius=len;
		
	}
	AreaShape(int len){
		side=len;
	}
	
	void area_cir() {
		double z = 3.14 * radius * radius;
		System.out.println("the area of the circle is "+z+" sq units");
	}
	
	void area_rec() {
		
	    System.out.println("the area of the rectangle is "+ length*breadth +" sq units");
	}
	void area_sq()
    {
        System.out.println("the area of the square is "+Math.pow(side, 2)+" sq units");
    }
	
}


public class Overloading {
	
	public static double area(double d, double e) {
		// TODO Auto-generated method stub
		return 0.5*d*e;
	}
	public static double area(int e, int f) {
		return 0.5*e*f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		AreaShape circle= new AreaShape(2.3f);
		circle.area_cir();
		AreaShape square = new AreaShape(4);
		square.area_sq();
		AreaShape rect= new AreaShape(6,7);
		rect.area_rec();
			
		

			
		double area_rh=area(5.6,6.4);
		double area_tri=area(3,4);
		
		System.out.println("Area of Rhombus "+area_rh+"| Area of Triangle: "+area_tri);

	}


	

}
