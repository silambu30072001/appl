package string;

public class equals {
	public static void main(String[] args) {
		String s="abc";
		String s1="ABC";
		boolean b=s.equals(s1);
		System.out.println(b);
		boolean c=s.equalsIgnoreCase(s1);
		System.out.println(c);
	}

}
