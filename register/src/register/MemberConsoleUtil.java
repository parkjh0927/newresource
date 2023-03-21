package register;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberConsoleUtil {
	public Member getNewMember(Scanner sc) {
		// 새로운 Member 정보 입력받기
		System.out.print("ID 입력 : ");
		String id = sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("주소 입력 : ");
		String address = sc.nextLine();
		System.out.print("이메일 입력 : ");
		String email = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = Integer.parseInt(sc.nextLine());
		return new Member(id,name,address,email,age);
	}
	
	public void printAddSuccessMessage(Member member) {
		//홍길동님 회원 정보 추가 성공 메세지 출력
		System.out.println(member.getName()+"님 회원 정보 추가 성공");
	}
	
	public void printMemberList(ArrayList<Member> list) {
		for (Member member : list) {
			System.out.printf("%7s",member.getName());
			System.out.printf("%7s",member.getId());
			System.out.printf("%7s",member.getEmail());
			System.out.printf("%7s",member.getAddress());
			System.out.printf("%7d",member.getAge());
			System.out.println();
		}
	}
	
	public Member updateMember(Scanner sc, ArrayList<Member> list) {
		//수정할 회원의 아이디를 입력받기
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.nextLine();
		// list에서 입력된 회원의 아이디랑 일치하는 회원 찾기
		//회원이 존재한다면 변경할 주소를 입력받기
//		Iterator<Member> it = list.iterator();
//		while(it.hasNext()) {
//			Member member = it.next();
//		}
		
		
		for (Member member : list) {
			if(member.getId().equals(id)) {
				System.out.print("변경할 주소 입력 : ");
				String add = sc.nextLine();
				member.setAddress(add);
				return member;
			}
		}
		return null;
		//주소를 변경한다.
		
		//수정된 회원을 리턴
	}
	
	public void printUpdateSuccessMessage(Member member) {
		System.out.println(member.getName()+"님 회원 정보 수정 성공 메세지 출력");
	}
	
	public void printUpdateFailMessage() {
		System.out.println("회원 정보 수정에 실패하였습니다.");
	}
	
	public Member removeMember(Scanner sc, ArrayList<Member> list) {
		System.out.print("삭제할 회원 아이디 입력 : ");
		String id = sc.nextLine();
		for (Member member : list) {
			if(member.getId().equals(id)) {
				list.remove(member);
				return member;
			}
		}
		return null;
	}
	
	public void printRemoveSuccessMessage(Member member) {
		System.out.println(member.getName()+"님 회원 정보 삭제 성공");
	}
	
	public void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제에 실패하였습니다.");
	}
	
}
