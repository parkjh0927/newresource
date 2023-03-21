package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputEx1 {

	public static void main(String[] args) throws IOException {
		//File에서 내용 읽기
		// text, 음악, 동영상, 이미지...
		// text : byte 기반, 문자 기반
		// 음악, 동영상, 이미지 : byte 기반
//		FileInputStream fis = null;
//		
//		OutputStream out = System.out;
//		try {
//			fis = new FileInputStream(".\\src\\io\\FileEx4.java");
//			
////			int data = 0;
////			while((data=fis.read())!=-1) {
////				System.out.print((char)data);
////			}
//			
//			byte[] b = new byte[100];
//			while(fis.read(b)!=-1) {
//				out.write(b);
//			}
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			fis.close();
//		}

		
		
		
		try(FileInputStream fis = new FileInputStream(".\\src\\io\\FileEx4.java");OutputStream out = System.out;) {
			 
			
//			int data = 0;
//			while((data=fis.read())!=-1) {
//				System.out.print((char)data);
//			}
			
			byte[] b = new byte[100];
			while(fis.read(b)!=-1) {
				out.write(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
