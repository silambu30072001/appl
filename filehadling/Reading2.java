package filehadling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading2 {
	public static void main(String... args)throws IOException 
	{
		File f=new File("d:/file/");
		FileReader fw=new FileReader(f+"/q.txt");
		BufferedReader br=new BufferedReader(fw);
		
		String content="";
while((content =br.readLine())!=null)
{
		System.out.println(content);
	}

}
}
