package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		List<Member1> member = new ArrayList<>();
		member.add(new Member1("홍길동"));
		member.add(new Member1("성춘향"));
		member.add(new Member1("고길동"));
		member.add(new Member1("강감찬"));
		member.add(new Member1("송혜교"));
		
		System.out.println(member);
		
		List<Member2> member2 = new ArrayList<>();
		member2.add(new Member2("홍길동", "hong123", "hong123"));
		member2.add(new Member2("고길동", "kong123", "kong123"));
		member2.add(new Member2("성춘향", "song123", "song123"));
		member2.add(new Member2("강감찬", "kong123", "kong123"));
		member2.add(new Member2("송혜교", "tong123", "tong123"));
		
		System.out.println(member2);
		
		for(int i=0;i<member2.size();i++) {
			member2.get(i);
		}
		
		System.out.println();
		System.out.println("id         password           name");
		System.out.println("=================================");
		
		for (Iterator iterator = member2.iterator(); iterator.hasNext();) {
			Member2 member22 = (Member2) iterator.next();
			System.out.println(member22.getId()+"\t"+member22.getPassword()+"\t"+member22.getName());
		}
		
		for (Member2 member22 : member2) {
			
		}
	}

}
