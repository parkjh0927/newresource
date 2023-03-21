package shop;

import java.util.Scanner;

public class MyShop2 implements IShop {
	Scanner sc = new Scanner(System.in);
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열
	User[] users = new User[2];
	//Product 정보 저장 배열
	Product products[] = new Product[4];
	int total = 0;
	
	Product carts[] = new Product[10];
	
	
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		//User 2명 생성 후 배열에 저장
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new CellPhone("삼성", 1000000, "U+");
		products[1] = new CellPhone("Apple", 1500000, "KT");
		products[2] = new SmartTv("LG", 1800000, "UHD");
		products[3] = new SmartTv("삼성", 2000000, "FHD");
		
	}

	@Override
	public void start() {
		System.out.println(title + " :메인화면 - 계정 선택");
		System.out.println("===============================");
		for(int i = 0;i<users.length;i++) {
			System.out.println("["+i+"]"+users[i].getName()+"("+users[i].getPayType()+")");
		}
		System.out.println("[x]종  료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		switch(sel) {
		case"x": case "X":
			System.exit(0);
			break;
		case "0":
			productList(sel);
			break;
		case "1":
			
			break;
		default:
			System.out.println("메뉴를 확인해 주세요.");
			start();
			break;
		}
	}
	
	public void productList(String sel) {
		System.out.println();
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("==================================");
		for(int i = 0;i<products.length; i++) {
			System.out.printf("[%d]",i);
			products[i].printDetail();
			products[i].printExtra();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		String select = sc.nextLine();
		
		switch(select) {
		case "0": case "1": case "2": case "3":
			for(int i = 0; i<carts.length; i++) {
				if(carts[i]==null) {
					carts[i] = products[Integer.parseInt(select)];
					break;
				}
			}
			productList(sel);
			break;
		case "h" : case "H":
			start();
			break;
		case "c" : case "C":
			checkOut();
			break;
		default:
			System.out.println("입력값을 확인해 주세요");
		}
	}
	
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("==============================");
		
		for (int i = 0; i<carts.length;i++) {
			if(carts[i] != null) {
				System.out.printf("[%d] %s(%d)/n", i, carts[i].getName(),carts[i].getPrice());
				total += carts[i].getPrice();
			}
		}
		
		System.out.println("===========================");
		System.out.println("결제 방법 : ");
		System.out.println("결제 금액 : "+total);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		
	
	}

}
