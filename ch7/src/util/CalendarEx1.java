package util;

import java.util.Calendar;

public class CalendarEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.toString());
		
		System.out.println("년도 : "+today.get(Calendar.YEAR));
		System.out.println("월 : "+(today.get(Calendar.MONTH)+1));
		System.out.println("주 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일 : "+today.get(Calendar.DATE));
		System.out.println("오전 오후 : "+today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : "+today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : "+today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999) : "+today.get(Calendar.MILLISECOND));
	
		
	}

}
