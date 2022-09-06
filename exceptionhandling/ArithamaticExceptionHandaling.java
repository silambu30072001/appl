package exceptionhandling;

public class ArithamaticExceptionHandaling {
	public static void main(String[] args) {
		try {
		int i=100/0;
		System.out.println(i);//exception handlig occur and termination
		}
		catch(ArithmeticException e)
		{
			System.out.println("aaaa");
		}
		System.out.println("hello");
		}

}
