package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;


public class FileInputEx3 {

	public static void main(String[] args) {
		// FileInputEx1.java 를 읽어서 화면 출력
		// 행 번호와 같이 출력
		
		try(FileReader reader = new FileReader(".\\src\\io\\FileEx4.java");
				PrintStream out = System.out){
			int data = 0;
			int num = 1;
			out.printf("%-7d",num);
			while((data = reader.read())!= -1) {
				out.print((char)data);
				if((char)data==(char)('\n')) {
					num++;
					out.printf("%-7d",num);
				}
					
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
