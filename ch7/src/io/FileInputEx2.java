package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx2 {

	public static void main(String[] args) {
//		// copy ( C:\\temp\\file1.txt => C:\\temp\\file2.txt )
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		// 원본 파일 읽기
//		try {
//			fis = new FileInputStream("C:\\temp\\image.png");
//			fos = new FileOutputStream("C:\\temp\\copy.png");
//			
//			int data = 0;
//			while((data=fis.read())!=-1) {
//				fos.write(data);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
		// 원본 파일 읽기
		try (FileInputStream fis =new FileInputStream("C:\\temp\\image.png");FileOutputStream fos = new FileOutputStream("C:\\temp\\copy.png")){
			
			int data = 0;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
