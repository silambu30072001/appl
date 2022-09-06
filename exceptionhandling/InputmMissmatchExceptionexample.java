package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputmMissmatchExceptionexample {
	public static void main(String[] args) {
	System.out.println("enter age");
	Scanner s=new Scanner(System.in);
	try {
	int b=s.nextInt();
	System.out.println(b);
	}
	catch (ArithmeticException e)//no execute reson is inputmissmatch exception
	{
	 System.out.println("fff");
	}
	catch (InputMismatchException e)
	{
	 System.out.println("InputMismatchException");
	}
	
	}

}
