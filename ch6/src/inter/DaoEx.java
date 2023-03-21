package inter;

public class DaoEx {

	public static void main(String[] args) {
//		OracleDao oracle = new OracleDao();
		DataAccessObject oracle = new OracleDao();
		dbWork(oracle);
		
		
		Mysql mysql = new Mysql();
		dbWork(mysql);

	}
	
	static void dbWork(DataAccessObject mysql) {
		mysql.select();
		mysql.insert();
		mysql.update();
		mysql.delete();
	}
//	static void dbWork2(OracleDao oracle) {
//		oracle.select();
//		oracle.insert();
//		oracle.update();
//		oracle.delete();
//	}

}
