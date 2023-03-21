package lang;

public class StringEx4 {

	public static void main(String[] args) {
		String names[]= {"Queen","Tod","Park","Kim","Hong"};
		
		System.out.println(findKim(names));
		

	}
	
	public static String findKim(String[] seoul) {
		for(int i = 0;i<seoul.length;i++) {
			if(seoul[i].compareToIgnoreCase("Kim")==0) {
				return "김씨 성은 " + (i+1) + "번째에 있다.";
			}
		}
		return "김씨 성은 없다.";
	}

}
