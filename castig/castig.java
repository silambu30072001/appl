package castig;
class parent
{
	public void test()
	{
		System.out.println("some");
	}
}
public class castig extends parent {
	
	public void test() {//method overriding
System.out.println("kkk");	
}
public static void main(String[] args) {
	parent p=new castig();//auto upcasting
	p.test();
}
}


