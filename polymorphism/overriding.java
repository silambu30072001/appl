package polymorphism;
class parent{
	public void test(){
		System.out.println("hiiii");
	}
}
public class overriding extends parent {
	//public void test() {
		//System.out.println("hii");
	//}
	public static void main(String[] args) {
		overriding o=new overriding();
		o.test();
	}

}
