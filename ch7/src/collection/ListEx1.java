package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 프레임웍
 * 컬렉션 : 여러 데이터들을 모아 놓은 것
 * framework : 표준화, 정형화된 프로그래밍 방식
 * 
 * 라이브러리 : 공통으로 사용될만한 유용한 기능을 모듈화
 * 
 * 	   Collection
 * 
 *  List		Set
 *  
 *  Map
 *  
 *  List 인터페이스 : 순서가 존재함, 데이터 중복 허용
 *    구현클래스 : ArrayList, LinkedList, Stack, Vector...
 *    
 *  Set 인터페이스 : 순서를 유지하지 않음, 데이터 중복 허용하지 않음
 *    구현클래스 : HashSet, TreeSet...
 *    
 *  Map 인터페이스 : key, value 의 쌍으로 이루어진 데이터 집합
 *  			  순서를 유지하지 않음. key는 중복 안되고 value는 중복 허용
 *    구현 클래스 : HashMap, TreeMap, Hashtable, Properties...
 *    
 *    
 *  <E> or <T>, <K,V> : 지네릭스 개념==> 타입 지정
 *  E : element 타입 지정
 *  
 *  타입 : 참조 타입만 지정가능
 */


public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		
		System.out.println("size() " + list.size());
		System.out.println("isEmpty() " + list.isEmpty());
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list2.add("자바");
		list2.add("파이썬");
		list2.add("C언어");
		list2.add("자바스크립트");
		
		String fruits[]= {"사과","포도","메론","딸기","바나나"};
		
		List<String> list3 = Arrays.asList(fruits);
		System.out.println(list3);
		List<String> list4 = new ArrayList<>(Arrays.asList(fruits));
		list4.add("참외");
		
		System.out.println(list4);
		
		list.add(3,6);
		System.out.println(list);
		
		list.set(3, 7);
		System.out.println(list);
		
		list2.remove(2);
		System.out.println(list2);
		
		list4.remove("바나나");
		System.out.println(list4);
		
		System.out.println(list2.get(0));

		System.out.println(list2.indexOf("파이썬"));
		
		Collections.sort(list4);
		System.out.println(list4);
		
		list.sort(Comparator.naturalOrder());
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
		
	}

}
