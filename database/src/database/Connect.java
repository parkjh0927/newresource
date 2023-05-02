package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * JDBC(Java Database Connectivity)
 * 자바에서 데이터베이스에 접속할 수 있도록 제공해주는 자바 api
 * 
 * 프로젝트에 ojdbc8.jar 포함되어야 함
 * [build path] - [configure build path] - class path 에 ojdbc8.jar 포함
 * 
 * 1) connection 가져오기
 * 	- 드라이버 로드
 * 	- 연결문자열 연결 시도
 * 2) DB 서버에 접속해서 원하는 작업(CRUD) 하기
 *  - Create Read Update Delete
 *  
 */



public class Connect {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//jdbc:oracle:thin:@ 고정
			//localhost:1521:xe => 변경 가능한 값
			//localhost == 127.0.0.1(내 컴퓨터)
			//1521(포트 번호)
			//xe(기본 xid 이름)
	
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
		
			
			con = DriverManager.getConnection(url, user, password);
			
//			if(con!=null) {
//				System.out.println("연결되었습니다." );
//			}
			
			String sql = "select * from emp";
			//서버로 sql 구문 전송
			pstmt = con.prepareStatement(sql);
			//전소된 sql 구문 실행 후 결과를 ResultSet 객체에 담게 됨
			rs = pstmt.executeQuery();
			
			//ResultSet 객체안에 한 행씩 읽어오면서 화면 출력
			//rs.next() : ResultSet 객체안에 행이 존재한다면 true 돌려줌, 없으면 false
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getInt("mgr")+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getInt(6)+"\t");
				System.out.print(rs.getInt(7)+"\t");
				System.out.println(rs.getInt("deptno")+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
