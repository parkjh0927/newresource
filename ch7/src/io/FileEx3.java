package io;

import java.io.File;

public class FileEx3 {
	static int deletedFiles = 0;
	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("사용법 : java fileEx3 디렉토리명");
			System.exit(0);
		}
		
		String currDir = System.getProperty("user.dir");
		System.out.println(currDir);
		File dir = new File(currDir);
		String ext = "."+args[0];
		
		delete(dir,ext);
		System.out.println(deletedFiles + "개의 파일이 삭제되었습니다.");
	}
	
	public static void delete(File dir, String ext) {
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()) {
				delete(files[i], ext);
			}else {
				String fileName = files[i].getAbsolutePath();
				
				if(fileName.endsWith(ext)) {
					System.out.println(fileName);
					if(files[i].delete()) {
						System.out.println(" - 삭제 성공");
						deletedFiles++;
					}else {
						System.out.println(" - 삭제 실패");
					}
				}
			}
		}
	}

}
