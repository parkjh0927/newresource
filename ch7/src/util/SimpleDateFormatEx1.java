package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		
		Date date = new Date(); 
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(date));

		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 MM월 dd일 E a HH:m:s");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = sdf3.parse("2023년 03월 09일");
			System.out.println(sdf4.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
