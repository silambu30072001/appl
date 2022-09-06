package exceptionhandlingueser;

import java.util.Scanner;

public class MarkExceptiontest {
	public static void main(String[] args) {
		
	int totalmark=50;
System.out.println("enter mark");
Scanner s=new Scanner(System.in);
 int failmark=s.nextInt();
 if(totalmark<=failmark) {
	 System.out.println("PASS");
 }
 else {
	 throw new MarkException("fail");
 }
	}
}
