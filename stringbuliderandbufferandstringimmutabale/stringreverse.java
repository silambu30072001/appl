package stringbuliderandbufferandstringimmutabale;

public class stringreverse {
	public static void main(String[] args) {
		String a="chennai";
		StringBuffer sb=new StringBuffer(a);
		System.out.println(sb);
		sb.reverse();
		//System.out.println(sb);
	String b=sb.toString();
	System.out.println(b);//coverting String
		
	}

}
