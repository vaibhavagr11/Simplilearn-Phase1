package prolim.phase1.core;

import java.util.LinkedHashMap;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> hmp= new LinkedHashMap<Integer,String>();
		hmp.put(1, new String ("Samsung"));
		hmp.put(2, new String ("Mi"));
		hmp.put(3, new String ("Toshiba"));
		hmp.put(4, new String ("HCL"));
		hmp.put(5, new String ("Wipro"));
		
		System.out.println(hmp);
		
		for(Integer k:hmp.keySet()) {
			System.out.println(k + " " + hmp.get(k));
			
		}
		
		System.out.println("Size of Linked HashMap is "+ hmp.size());
		System.out.println("Is Linked HashMap empty "+ hmp.isEmpty());
		System.out.println(" Linked HashMap contains 2 as a key? "+ hmp.containsKey(2));
		System.out.println("Linked HashMap contains HCL as a value?  "+ hmp.containsValue("HCL"));
		System.out.println("Remove entry for key 3"+ hmp.remove(3));
		
		
		

	}

}
