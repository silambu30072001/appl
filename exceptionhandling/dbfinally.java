package exceptionhandling;

public class dbfinally {
	public static void main(String[] args) {
		///db connection start
		System.out.println("db start");
		try {
		int i=100/0;
		System.out.println("i");
		}
		catch(NullPointerException e)
		{
			System.out.println("hhhh");
		}
		finally {
			System.out.println("finally");//always executed
		
		System.out.println("db end");
		}
		}

}
