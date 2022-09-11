package set;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Linkedhashset {
	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add("abc");///it can maintain the inseration order
		s.add("aaa");
		s.add("azz");
		s.add("azz");
		s.add("mmm");
		s.add(12);
		System.out.println(s);
		s.remove("abc");		
		System.out.println(s);
//s.clear();
//System.out.println(s);
System.out.println(s.contains("mmm"));
System.out.println(s.isEmpty());
System.out.println(s.size());
 List a=new LinkedList(s);///coverting forrm set to list or listto both are possible
 System.out.println(a);
	}

}
