package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class waysarrayitertion {
	public static void main(String[] args) {
		List l=new ArrayList();//auto upcasting
			l.add("rrr");
			l.add("123");
			l.add(78);
			l.add(45);
			l.add("33");
			l.add(00);
			l.add("yyy");
			for(int i=0;i<l.size();i++) {
				System.out.println(l.get(i));//normal
			}
			for(Object s:l)
			{
				System.out.println(s);//enhanced forloop
			}
			Iterator i=l.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
			ListIterator li=l.listIterator();{
				System.out.println(li.next());
			}
			
			
	}

}
