package exceptionhandling;

import java.util.InputMismatchException;

public class exceptionhirarachy {
	public static void main(String[] args) {
		String s=null;
		try {
		int i=s.length();
		System.out.println(i);
		}
		catch(ArithmeticException |NullPointerException|InputMismatchException e)//1.7 update version//
		{
			System.out.println("ArithamaticException ");//////lower to higher (condition)
		}	
		catch(RuntimeException e)
		{
			System.out.println("Runtimeexception");
		}	
		
		catch(Exception e)
		{
			System.out.println("exception");
		}
		catch(Throwable e)
		{
			System.out.println("throwable");
		}
		
		finally {
			System.out.println("hello");
		}
		
		}



}
