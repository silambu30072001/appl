package set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Convertingformsettolist {
	public static void main(String[] args) {
		List animal=new ArrayList();
		animal.add("rabbit");
		animal.add("cat");
		animal.add("rabbit");
		animal.add("cow");
		animal.add("tiger");
		System.out.println(animal);
		Set emp=new TreeSet();
		//emp.add("rabbit");
	//	emp.add("ant");
		//emp.add("cat");
	//	emp.add("rabbit");
	//	emp.add("cow");
	//	emp.add("tiger");
		System.out.println(emp);
		for(int i=0;i<animal.size();i++)
		{
			if(!emp.contains(animal.get(i)))////converting for list to set
			{
				emp.add(animal.get(i));
			}
		}
		System.out.println(emp);

	}


}
