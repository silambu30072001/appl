package encapsulation;

public class Exp2 {
	public static void main(String[] args) {
		Example1 a=new Example1();
		a.setempId(100);
		System.out.println(a.getempId());
		a.setemailId("abc");
		System.out.println(a.getemailId());
		a.setsalary(400.89);
		System.out.println(a.getsalary());
	}

}
