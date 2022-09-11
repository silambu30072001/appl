package set;

import java.util.LinkedHashSet;


public class Example {
	public static void main(String[] args) {
		LinkedHashSet animal=new LinkedHashSet();
		animal.add("rabbit");
		animal.add("cat");
		animal.add("cow");
		animal.add("tiger");
		animal.add("tiger");
		System.out.println(animal);
		
		LinkedHashSet animal1=new LinkedHashSet();
		
		animal1.add("dog");
		animal1.add("lion");
		animal1.add("ant");
		System.out.println(animal1);
		animal.addAll(animal1);
		System.out.println(animal);
		//animal.removeAll(animal1);
		//System.out.println(animal);
		animal.retainAll(animal1);
		System.out.println(animal);
	}

}
