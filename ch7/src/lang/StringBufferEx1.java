package lang;

/*자바에서 문자열 다루기
 * 1) String
 * 2) StringBuffer : 원본 문자열 변경 가능 / 멀티쓰레드 안전
 * 3) StringBuilder : 원본 문자열 변경 가능 / 멀티쓰레드 
 */

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer(100);
		StringBuffer sb3=new StringBuffer("Hello"); //버퍼 길이는 문자열 길이만큼
	
		//StringBuffer sb4 = "Hello";	안됨
		
		sb2.append(false).append("abc").append("d");
		
		System.out.println(sb2);
		
		StringBuffer sb4 = new StringBuffer("Hello");
		System.out.println("equals() "+sb3.equals(sb4));
		
		
		String str1 = sb3.toString();
		String str2 = sb4.toString();
		System.out.println("String equals() "+str1.equals(str2));
		
		StringBuffer sb5 = new StringBuffer("0123456");
		StringBuffer sb6 = sb5.delete(3,6);
		System.out.println("sb5 "+sb5);
		System.out.println("sb6 "+sb6);
	
		sb5 = new StringBuffer("0123456");
		sb6 = sb5.deleteCharAt(4);
		System.out.println("sb5 " + sb5);
		System.out.println("sb6 " + sb6);
		
		sb5.insert(4,  "-");
		System.out.println("insert() "+sb5);
		
		sb5 = new StringBuffer("0123456");
		sb5.replace(3, 6, "ABC");
		System.out.println("replace() " + sb5);
		
		str2 = "0123456789";
		for(int i=str2.length()-1;i>=0;i--) {
			System.out.print(str2.charAt(i));
		}
		System.out.println();
		sb5 = new StringBuffer(str2);
		System.out.println(sb5.reverse());
		
		sb5 = new StringBuffer("0123456");
		sb5.setCharAt(4, 'A');
		System.out.println("setCharAt() "+sb5);

		
	
	
	
	
	}

}
