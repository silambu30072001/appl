package filehadling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvExample {
	public static void main(String[] args) throws IOException{
		File f=new File("D:/file/");
		FileReader fw=new FileReader(f+"/emp.csv");
		BufferedReader br=new BufferedReader(fw);
		String content="";
		while((content=br.readLine())!=null)
		{
			String a[]=content.split(",");
			for(int i=0; i<a.length; i++) 
			{
		    System.out.println(a[0].concat("   ").concat(a[1]));
	
			}
			}
	}
}
