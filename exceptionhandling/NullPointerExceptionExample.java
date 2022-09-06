package exceptionhandling;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		System.out.println("hhh");
		String s = null;
		try {
		char a=s.charAt(2);//nullpoiterexception
		System.out.println(a);
		int a1=s.length();
		System.out.println(a1);

		}
		catch (NullPointerException e) 
		{
			System.out.println("hello");
		}
		System.out.println("abc");
	}

}
