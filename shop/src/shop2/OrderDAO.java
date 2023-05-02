package shop2;

import static shop2.JdbcUtil.*;
//JdbcUtil 클래스 : 드라이버로드,connection,close 반복작업을 하나의 클래스에 정의

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public boolean insert(int userId, int productId) {
		boolean status = false;
		
		try {
			
			String sql = "insert into sorder values(order_seq.nextval,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  userId);
			pstmt.setInt(2, productId);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return status;
	}
}
