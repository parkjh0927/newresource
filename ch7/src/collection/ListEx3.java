package collection;

import java.util.LinkedList;

/* 배열과 List 동일한 개념
 * 배열은 크기를 변경할 수 없다(새로운 배열을 생성해서 데이터를 복사 작업이 필요)
 * 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸림(중간에 데이터의 추가, 삭제 작업이 불편함)
 * 
 * 
 * LinkedList
 */

public class ListEx3 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		list.add("사과");
		list.add("자두");
		list.add("수박");
		list.add("딸기");
		list.add("참외");
		list.add("배");
		list.add("멜론");
		list.add("바나나");
		
		for (String fruit : list) {
			System.out.println(fruit);
		}

	}

}
