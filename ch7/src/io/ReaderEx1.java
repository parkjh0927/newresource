package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderEx1 {

	public static void main(String[] args) {
		
		Reader reader = null;
		Writer writer = null;
		
		// Reader, Writer : 문자기반
		try {
			reader = new FileReader("c:\\temp\\file1.txt");
			
			// append : true
			writer = new FileWriter("c:\\temp\\output1.txt",true);
			
			int data = 0;
			while((data = reader.read())!= -1) {
				writer.write(data);
			}
			
			
//			int data = 0;
//			while((data = reader.read())!=-1) {
//				System.out.print((char)data);
//			}
//			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
