package string;

public class split {
	public static void main(String[] args) {
	String s="apple,orange,mango,gova,banana,ball";
	String s1[]=s.split(",");
	System.out.println(s1[2]);
	for(int i=0; i<s1.length; i++)
	{
	System.out.println(s1[i]);
	if(s1[i].startsWith("b"))
	{
		System.out.println(s1[i]);
	}
	if(s1[i].endsWith("a"))
	{
		System.out.println(s1[i]);
	}
	}
	}
}
