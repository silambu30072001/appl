package set;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("abc");///it cannot maintain the inseration order
		s.add("aaa");
		s.add("azz");
		s.add("mmm");
		s.add(12);
		System.out.println(s);
		
	}

}
