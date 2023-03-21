package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("김자바", 90);
		map.put("홍자바", 100);
		map.put("박자바", 95);
		map.put("이자바", 98);
		map.put("최자바", 88);
		map.put("표자바", 89);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		Iterator<Entry<String, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)it.next();
			System.out.println("이름 : " + entry.getKey()+", 점수 : " + entry.getValue());
		}
		
		
		
		Set<String> keys= map.keySet();
		
		Collection<Integer> values = map.values();
		System.out.println("점수 ㅣ " + values);
		
		int total = 0;
		Iterator<Integer> it2 = values.iterator();
		while(it2.hasNext()) {
			total += it2.next();
		}
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)total/set.size());
		System.out.println("최고 점수 "+ Collections.max(values));
		System.out.println("최저 점수 "+ Collections.min(values));
		
	}
	
	

}
