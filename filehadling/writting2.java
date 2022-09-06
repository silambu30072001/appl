package filehadling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writting2 { 
	public static void main(String[] args) {
		File f= new File ("d:/file/");
	    String content="hi hello everyone";
	    FileWriter  fw=null;
	    try {
	     fw =new FileWriter(f+"/q.txt");
	     fw.write(content);
	    }
	    catch(IOException e) {
	    	e.getStackTrace();
	    }
	    finally {
	    	try
	    	{
	    		fw.close();
	    	}
	    
	    catch(IOException e){
	    	e.getStackTrace();	
	    }
	    
	    }
	    
	}
}
