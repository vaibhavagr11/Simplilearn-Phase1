package prolim.phase1.core;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.addFirst("January");
		ll.addLast("February");
		ll.addLast("March");
		ll.addLast("April");
		
		System.out.println(ll.size());
		
		for(String s:ll) {
			System.out.println(s);
			
		}
		
		ll.addLast("September");
		ll.addLast("October");
		
		System.out.println(ll.size());
		
		for(String s:ll) {
			System.out.println(s);
			
		}
		
		ll.add(4,"May");
		ll.add(5,"June");
		ll.add(6,"July");
		ll.add(7,"August");
		
		System.out.println(ll.size());
		
		for(String s:ll) {
			System.out.println(s);
			
		}
		
		ll.addLast("November");
		ll.addLast("December");
		
		System.out.println(ll.size());
		
		for(String s:ll) {
			System.out.println(s);
			
		}
		
		
		System.out.println(ll);
		
		

	}

}
