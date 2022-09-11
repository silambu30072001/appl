package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Addalllist {
	public static void main(String[] args) {
		
	List animal=new ArrayList();
	animal.add("rabbit");
	animal.add("cat");
	animal.add("cow");
	animal.add("tiger");
	System.out.println(animal);
	
	List animal1=new ArrayList();
	
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
