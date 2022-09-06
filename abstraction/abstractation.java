package abstraction;
abstract class c1
{
	abstract void test1();
}
abstract class c2//multilevel inheritance
{
	abstract void test2();
}
abstract class c3
{
  abstract void test3();//hidding class
}

public class abstractation extends c3 {
	public void test1()
	{
		System.out.println("sss");
	}
	
	public void test2()
	{
		System.out.println("ss");
	}
	
	public void test3()
	{
		System.out.println("ssss");
	}
	public static void main(String[] args) {
		abstractation a=new abstractation();
		a.test1();
		a.test2();
		a.test3();
	}

}
