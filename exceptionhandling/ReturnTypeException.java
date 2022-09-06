package exceptionhandling;

public class ReturnTypeException {
	public static void main(String[] args) {
		ReturnTypeException t = new ReturnTypeException();
		System.out.println(t.test());
	}
public double test() {
	try {
		double s=34/0;
		return 2;
	}
	catch(Exception e)
	{
		return  3;
	}
	finally {
	//return 4;	
	}
	//return 5;
}
}
