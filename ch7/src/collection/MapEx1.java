package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		//put(key, value) : 요소 추가(key 값이 동일하다면 나중에 추가한 요소만 남게 됨)
		map.put("myId1", "1234");
		map.put("myId2", "4321");
		map.put("myId3", "6789");
		map.put("myId4", "9876");
		
		System.out.println(map);
		String pwd = "";

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("id 입력 : ");
			String id = sc.nextLine();
			if(!map.containsKey(id)) {
				System.out.println("입력하신 아이디는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			}else {
				while(true){
					System.out.print("비밀번호 입력 : ");
					pwd = sc.nextLine();
					if(!pwd.equals(map.get(id))) {
						System.out.println("다시 입력해 주세요");
					}else {
						System.out.println("종료");
						break;
					}
				}
				break;
			}
		}
		
	}

}
