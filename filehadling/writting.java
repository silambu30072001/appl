package filehadling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writting { 
	public static void main(String[] args) throws IOException {
		File file=new File ("d:/file/");
	   String  content="my text...............";
	   FileWriter fw=new FileWriter(file+"/s.txt");
	    fw.write(content);
		try {
			fw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	}
	
	



