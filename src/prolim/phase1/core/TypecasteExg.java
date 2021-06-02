package prolim.phase1.core;

public class TypecasteExg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		long l=700000000000000L;
		System.out.println("long value "+l);
		
		int o=(int)l;
		System.out.println("int value "+ o);
		
		char c= (char)i;
		System.out.println("char value: "+ c);
		
		char t='d';
		int a=t;
		System.out.println("Integer Value: "+a);
		
		long k=560000000000L;
		int b=(int) k;
		System.out.println("Integer Value: "+b);
		double dd=b;
		System.out.println("Integer Value: "+ dd);
		
		float ff= (float)dd;
		System.out.println("Integer Value: "+ ff);
		
		
		//--Typecast between Double and Float---//
		double d= 19056468867668868.7979788d;
		float r= (float)d;
		System.out.println("Float Value"+ r);
		System.out.println("double value "+d);
		
		//Typecast between Byte, int and double//
		
		
		int ii = 257;
		double dd1= 323.142;
		System.out.println("Conversion of int to byte ");
		b= (byte)ii;
		System.out.println("ii= "+ ii+ "b = "+b);
		
		System.out.println("Conversion of double to byte");
		b= (byte)dd1;
		System.out.println("dd="+dd+ "b= "+b);
		
		//tYPECAST between long and float
		float f= 1;
		System.out.println("float value"+ f);
		
		//typecast between double ->long->int//
		
		double d3= 868757557.4243;
		long l3=(long)d3;
		int i3= (int)l3;
		System.out.println(d3);
		System.out.println(l3);
		System.out.println(i3);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
