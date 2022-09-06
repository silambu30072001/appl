package filehadling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading {
public static void main(String... args)throws IOException 
{
	File f=new File("d:/file/");
	FileReader fw=new FileReader(f+"/q.txt");
	BufferedReader br=new BufferedReader(fw);
	String content =br.readLine();
	System.out.println(content);
}
}
