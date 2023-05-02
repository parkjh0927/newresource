package shop2;

import java.util.List;
import java.util.Scanner;

public class MyShop2 implements IShop {
	Scanner sc = new Scanner(System.in);
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 배열
	UserDTO[] users = new UserDTO[2];
	//Product 정보 저장 배열
	Product products[] = new Product[4];
	int total = 0;
	
	Product carts[] = new Product[10];
	
	
	private int selUser;
	UserDAO userDAO = new UserDAO();
	ProductDAO productDAO = new ProductDAO();
	OrderDAO orderDAO = new OrderDAO();
	
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {		
		System.out.println("***** User 입력 *****");
		System.out.print("userid >> ");
		int userId = Integer.parseInt(sc.nextLine());
		System.out.print("name >> ");
		String name = sc.nextLine();
		System.out.print("payNo >> ");
		int payNo = Integer.parseInt(sc.nextLine());
		
		System.out.println(userDAO.insert(userId, name, payNo)?"user 추가 성공":"user 추가 실패");
	}

	@Override
	public void genProduct() {
		System.out.println("***** 상품 입력 *****");
		System.out.print("product_id >> ");
		int productId = Integer.parseInt(sc.nextLine());
		System.out.print("pname >> ");
		String pname = sc.nextLine();
		System.out.print("price >> ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("content >> ");
		int content = Integer.parseInt(sc.nextLine());
		ProductDTO dto = new ProductDTO(productId, pname, price, pname);
		System.out.println(productDAO.insert(dto)?"상품 추가 성공":"상품 추가 실패");
		
	
	
	}
	
	
	@Override
	public void userList() {
		System.out.println("***** User 목록 *****");
		System.out.println("userId\tname\tpayNo");
		System.out.println("--------------------------");
		List<UserDTO> list = userDAO.getList();
		for(UserDTO userDTO : list) {
			System.out.print(userDTO.getUserID()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.print(userDTO.getPayNo()+"\t");
		}
		
		
	}
	

	@Override
	public void start() {
		System.out.println(title + " :메인화면 - 계정 선택");
		System.out.println("===============================");
		
		//현재 user 정보 출력
		List<UserDTO> list = userDAO.getList();
		for(UserDTO userDTO : list) {
			System.out.print(userDTO.getUserID()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.print(userDTO.getPayNo()+"\t");
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
		case "0": case "1":
			selUser = Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요.");
			start();
			break;
		}
	}
	
	public void productList() {
		System.out.println();
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("==================================");
		ProductDAO productDAO = new ProductDAO();
		
		List<ProductDTO> list = productDAO.getList();
		for(ProductDTO productDTO : list) {
			System.out.print(productDTO.getProductId()+"\t");
			System.out.print(productDTO.getPname()+"\t");
			System.out.print(productDTO.getPrice()+"\t");
			System.out.print(productDTO.getContent()+"\t");
		}
		
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		String sel = sc.nextLine(); 
		
		
		
		switch(sel) {
		case "2000": case "2001": case "2002": case "2003":
			orderDAO.insert(selUser,Integer.parseInt(sel));
			productList();
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
		//System.out.println("결제 방법 : ");
		System.out.println("결제 금액 : "+total);
		System.out.println("[p] 이전, [q] 결제완료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		
	
	}

}
