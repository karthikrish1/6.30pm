package filehng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class f2 {

	public static void main(String[] args) throws IOException {
		
		// File
		//FileReader
		//BufferedReader
		
		//nonstatic in nature
		File f= new File("a.txt");
		FileReader fr= new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		// first   : br.readline reads first line    line=hi     line!=null    =>  print line , hi
		// second  : br.readling reads second line   line=hello line!=null   print line       hello
		// loop terminates
	}
}
