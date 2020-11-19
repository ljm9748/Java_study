package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCOraclePreparedStatementTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		//1. 드라이버 로드
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Load!!");
			
			//2. db에 연결 == 127.0.0.1
			String jdbcUrl="jdbc:oracle:thin:@localhost:1521:orcl";
			String user= "scott";
			String password="tiger";
			
			conn= DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("데이터베이스에 접속했습니다.");
			
			//STATEMENT 인스턴스 생성
			Statement stmt = conn.createStatement();
			
			System.out.println("부서이름을 입력해 주세요");
			String userDname= sc.nextLine();
			System.out.println("부서위치를 입력해 주세요");
			String userLoc= sc.nextLine();
			
			//입력: insert
			String sqlInsert = "insert into dept values(SEQ_DEPT_DEPTNO.NEXTVAL, '"+userDname+"', '"+userLoc+"')";
			int resultCnt = stmt.executeUpdate(sqlInsert);
			
			if(resultCnt>0) System.out.println("데이터가 정상적으로 입력되었습니다");
			
			//4. sql실행
			String sql = "select * from dept order by deptno";
			ResultSet rs = stmt.executeQuery(sql);
			
			//5.resultset을 이용해서 결과 출력
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getNString(3);
				
				System.out.println(deptno+"\t"+dname+"\t"+loc);
				
			}
			
			//6.close
			rs.close();
			stmt.close();
		
			
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
