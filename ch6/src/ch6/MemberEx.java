package ch6;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member("hong123","hong1230!","hong1230","01012341234");		
		Member member2 = new Member("123hong","1230hong!","1230hong!","01045674567","서울 종로구");
		
		if(!member1.passwordAndConfirmPasswordEquals()) {
			System.out.println("비밀번호가 다릅니다.");
			member1.id = "";
			member1.password = "";
			member1.phonenumber = "";
			member1.address = "";
		}
		
		memberInfo(member1);
		memberInfo(member2);

	}
	
	static void memberInfo(Member member) {
		System.out.println("아이디 : " + member.id);
		System.out.println("비밀번호 : " + member.password);
		System.out.println("전화번호 : " + member.phonenumber);
		System.out.println("주소 : " + member.address);
		System.out.println("---------------------------");
	}

}
