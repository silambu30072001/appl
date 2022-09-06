package exceptionhandling;

import java.util.InputMismatchException;

public class finaly {
	public static void main(String[] args) {
		String s=null;
		try {
		int i=s.length();
		System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithamaticException ");
		}	
		catch(InputMismatchException e)
		{
			System.out.println("nullpointerexception");
		}	
		
		catch(NullPointerException e)
		{
			System.out.println("nullpointerexception");
		}
		finally {
			System.out.println("hello");
		}
		
		}

}
