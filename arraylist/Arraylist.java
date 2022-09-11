package arraylist;

import java.util.List;
import java.util.Vector;

import string.cotains;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arraylist {
	public static void main(String[] args) {
		List l=new ArrayList();//auto upcasting
	//	List l=new LinkedList();
		//List l=new Vector();
		l.add("rrr");
		l.add("123");
		l.add(78);
		l.add(45);
		l.add("33");
		l.add(00);
		l.add("yyy");
		System.out.println(l);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
			}
	l.remove(5);////this is use for the linked list not using form arraylist ...data missuse
		System.out.println(l);
		//l.clear();
		
		System.out.println(l.contains("yyy"));
System.out.println(l.isEmpty());
l.add(0,"gggg");
System.out.println(l);
	
		
	}

}
