package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Wayforloop {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add("abc");///it cannot maintain the inseration order
	s.add("aaa");
	s.add("azz");
	s.add("mmm");
	s.add(12);
	System.out.println(s);
	for(Object o:s)
	{
		System.out.println(o);//enhaced foorloop
	}
	Iterator i=s.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
}
}
