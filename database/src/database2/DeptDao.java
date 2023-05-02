package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// ~~~DAO : DataBase 작업을 담당하는 클래스임
public class DeptDao {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//커넥션을 위한 드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//커넥션을 리턴 메소드
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "TIGER";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	//close() : 자원닫기
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	//select-하나
	public DeptDTO getRow(int deptno) {
		//커넥션 가져오기
		con = getConnection();
		
		//sql 구문 작ㄱ성하기
		String sql = "select * from dept_temp where deptno=10";
		DeptDTO dto = null;
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				//System.out.println(rs.getInt(1)+ "\t"+rs.getString(2) + "\t"+rs.getString(3));
			
//				deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
//				dto = new DeptDTO(deptno, dname, loc);
				
				dto = new DeptDTO();
				deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			close(con,pstmt,rs);
		}
		return dto;
	}
	
	//select-all
	public ArrayList<DeptDTO> getRows() {
		
		ArrayList<DeptDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			String sql = "select * from dept_temp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				DeptDTO dto = new DeptDTO(deptno, dname, loc);
//				list.add(dto);
			
//				list.add(new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3)));
				
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
				list.add(dto);  
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	public boolean insert(int deptno, String dname, String loc) {
		//insert 성공 여부
		boolean status = false;
		
		try {
			
			con = getConnection();
			
			String sql = "insert into dept_temp(deptno, dname, loc) values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			//? 처리
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return status;
	}
	
	//부서 정보 수정 메소드
	public boolean update(String value, int deptno, int updateNo) {
		boolean status = false;
		
		//부서 수정
		try {
			String sql = null;
			con = getConnection();
			
			if(updateNo == 1) {
				sql = "update dept_temp set dname=? where deptno=?";
			} else if(updateNo == 2) {
				//위치 수정
				sql = "update dept_temp set loc=? where deptno=?";
			}
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,value);
			pstmt.setInt(2,  deptno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status = true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return status;
	}

}
