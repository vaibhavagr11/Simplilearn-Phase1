package prolim.phase1.core;

import java.util.Scanner;
import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<String>();
		System.out.println("Enter 6 programming languages ");
		
		Scanner input = new Scanner(System.in);
		String s1= input.nextLine();
		String s2= input.nextLine();
		String s3= input.nextLine();
		String s4= input.nextLine();
		String s5= input.nextLine();
		String s6= input.nextLine();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		
		System.out.println(ts);
		
		ts.remove(s1);
		ts.remove(s3);
		
		System.out.println(ts);
		
		System.out.println("Enter 2 more programming languages ");
		String s7= input.nextLine();
		String s8= input.nextLine();
		String s9=input.nextLine();
		ts.add(s7);
		ts.add(s8);
		ts.add(s9);
		
		System.out.println(ts);
		
		System.out.println(ts.contains("java"));
		
		for(String s:ts) {
			System.out.println(s);
			
			
		}
		ts.clear();
		
		System.out.println(ts);

	}

}
