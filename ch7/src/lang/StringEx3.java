package lang;

public class StringEx3 {

	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
	}
	
	public static int count(String src, String target) {
		int count = 0;
		int pos = 0;
		for(int i = 0;i<src.length();i++) {
			if(src.indexOf(target,pos)!=-1) {
				System.out.println(src.indexOf(target,pos));
				count++;
				pos+=target.length();
			}else {
				pos++;
			}
		}
		return count;
		
		
	}

}
