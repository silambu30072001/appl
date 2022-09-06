package stringbuliderandbufferandstringimmutabale;

public class immutableandmutable {
	
	public static void main(String[] args) {
		String s="xyz";
	//	s.concat("xyz");//immutabale xyz
String s1=s.concat("xyz");
	System.out.println(s1);
	
	StringBuilder a=new StringBuilder();
	a.append("xyz");//mutable chg it
	a.append("xyz");
	System.out.println(a);
	a.reverse();
	System.out.println(a);
	
	
	}

}
