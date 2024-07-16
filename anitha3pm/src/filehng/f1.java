package filehng;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class f1 {
	
	public static void main(String[] args) throws IOException {
		
		//file
		//filewriter
		//bufferedwriter
		// nonstatic
		File f= new File("a.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("hi");
		bw.newLine();
		bw.write("hello");
		bw.newLine();
		bw.close();
		
	}

}
