package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsEx2 {

	public static void main(String[] args) {
		ArrayList<Product> productList =new ArrayList<>();
		ArrayList<Tv> tvList = new ArrayList<>();
		//? : 와일드 카드
		//<? extends T> : T와 그 자손들만 가능
		//<? super T> : T와 그 조상들만 가능
		//<?> : 제한 없음. 모든 타입 가능
		
		//<? extends Product> : Product와 그 자손들만 가능
		
		
		ArrayList<Product> tvList2 = new ArrayList<>();
		List<Tv> tvList3 = new ArrayList<>();
		
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
		
		//Collections.sort(List<T> list, Comparator<? super T> c)
		static void printAll(ArrayList<Product> list) {
			for (Product product : list) {
				System.out.println(product);
			}
		}

	}

}
