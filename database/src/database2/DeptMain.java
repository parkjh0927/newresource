package database2;

public class DeptMain {

	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		
		
		
		
		
		//하나 조회
		dao.getRow(10);
		
		System.out.println();
		
		//전체 조회
		dao.getRows();
		
		//System.out.println(dao.insert(deptno, dname, loc)?"삽입 성공":"삽입 실패");
		//System.out.println(dao.update(input, deptno, updateNo);?"수정 성공":"수정 실패");
	}

}
