package abstraction;
interface s
{
abstract void test1();
}
interface b
{
abstract void test2();
}
public class interfaced implements s,b
{///interface concept multiple interface
	public void test1()
	{
		System.out.println("hi");
	}
	public void test2()
	{
		System.out.println("hii");
	}
public static void main(String[] args) {
	interfaced i=new interfaced();
	i.test1();
	i.test2();
}
}