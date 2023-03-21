package ch7;

import java.util.Arrays;

public class StringEx2 {

	public static void main(String[] args) {
		
		char c[] = {'H','e','l','l','o'};
		String str1 = new String(c);
		String str2 = "Hello";
		
		System.out.println(str1.charAt(1));
		
		String str3 = "자바 프로그래밍";
		
		System.out.println("indexOf(int ch) : "+str2.indexOf('o'));
		System.out.println("indexOf(int String) : "+str2.indexOf("llo"));
		System.out.println("indexOf(int int ch, int formIndex) : "+str2.indexOf('e',2));
		
		System.out.println("lastIndexOf(int ch) : "+str2.lastIndexOf('l'));
		
		String ssn = "880515-1222012";
		String result = ssn.substring(3,10);
		System.out.println(result);
		
		String result2 = str2.concat("안녕하세요");
		System.out.println(result2);
		
		String str4 = "java.long.Object";
		System.out.println(str4.startsWith("lang"));
		System.out.println(str4.startsWith("a",3));
		
		System.out.println("endsWith(String prefix " + str4.endsWith("ject"));
		
		System.out.println(str4.contains("long"));
		
		String str5 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		System.out.println(str5.replace("언어", "컴퓨터 언어"));
		System.out.println(str5.replaceFirst("자바", "java"));
		System.out.println(str5.replaceAll("java", "자바"));
		
		
		String str6 = "   Hello World   ";
		System.out.println("trim()  " + str6.trim());
		
		//static String valueOf()  :  지정된 값을 문자열로 변환하여 반환
		System.out.println(String.valueOf(true));
		
		System.out.println(str2.toLowerCase());
		
		String animals = "dog,cat,bear";
		//regex : regular expression(정규 표현식);
		String[] arr = animals.split(",");
		System.out.println(Arrays.toString(arr));
		
		arr = animals.split(",",2);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("aaa".compareTo("bbb"));
		System.out.println("aaa".compareTo("aaa"));
		System.out.println("bbb".compareTo("aaa"));
		
		
		arr = animals.split(",");
		System.out.println(Arrays.toString(arr));
		String str8 = String.join("-", arr);
		System.out.println(str8);
		
	}

}
