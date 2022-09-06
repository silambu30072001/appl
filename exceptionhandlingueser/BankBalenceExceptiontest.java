package exceptionhandlingueser;
import java.util.Scanner;
public class BankBalenceExceptiontest {

	public static void main(String[] args)  {
		double amountbalence=40000.00;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdrawal amount");
		double withdrwal=sc.nextDouble();

		if(amountbalence >= withdrwal) {
			System.out.println("sucessfull withdrawal");
		}
		else
		{
			throw new BankBalenceException("insuffient balence") ;
		}   
	}
}



