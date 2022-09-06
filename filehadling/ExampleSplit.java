package filehadling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExampleSplit {
public static void main(String... args)throws IOException {
	File file=new File("d:/file/");
	FileReader fr=new FileReader(file+"/k.txt");
	BufferedReader br=new BufferedReader(fr);
	String content="";
	
while((content=br.readLine()) !=null)
{
	String arr[] = content.split("#");
	for(int i=0; i<arr.length; i++) 
	{
		if(arr[i].startsWith("c")) {
		
	System.out.println(arr[i]);
		}
	}
	}
}
}
