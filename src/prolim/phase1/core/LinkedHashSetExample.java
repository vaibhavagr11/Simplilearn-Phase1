package prolim.phase1.core;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set1=new LinkedHashSet(); 
		LinkedHashSet<Integer> set2=new LinkedHashSet(); 
		
		set1.add(1);
		set1.add(false);
		set1.add('F');
		set1.add(4.3f);
		set1.add(3);
		set1.add(5.6f);
		set1.add('A');
		
		System.out.println(set1);
		System.out.println("Enter 1-8 in random order");
		Scanner sc= new Scanner(System.in); 
		
		for(int i=0; i<8; i++) {
			int a=sc.nextInt();	
			set2.add(a);
		}
		
		System.out.println(set2);
		
		

	}

}
