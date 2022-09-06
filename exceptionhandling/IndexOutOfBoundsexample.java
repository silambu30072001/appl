package exceptionhandling;

public class IndexOutOfBoundsexample {
	public static void main(String[] args) {
		
	
	String s="chenai";
	try {
	char a=s.charAt(69);
	System.out.println(a);//error occurstring outofbound
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("hello");
	}
	}
}
