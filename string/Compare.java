package string;

public class Compare {
	public static void main(String[] args) {
		String s1="abc";
		String s2="ABC";
     	int i=s1.compareTo(s2);
		System.out.println(i);	
		int j=s1.compareToIgnoreCase(s2);
		System.out.println(j);
	}

}
