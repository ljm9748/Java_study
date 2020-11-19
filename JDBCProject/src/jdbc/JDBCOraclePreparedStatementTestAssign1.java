package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Scanner;

public class JDBCOraclePreparedStatementTestAssign1 {
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
			
			System.out.println("사번을 입력해 주세요");
			int userempno= sc.nextInt();
			sc.nextLine();
			System.out.println("사원이름을 입력해 주세요");
			String username= sc.nextLine();
			System.out.println("사원직업을 입력해 주세요");
			String userjob= sc.nextLine();
			
			System.out.println("사원의상사 번호를 입력해 주세요");
			int usermgr= sc.nextInt();
			sc.nextLine();
			Calendar userhiredate = Calendar.getInstance();
			System.out.println("임금을 입력해 주세요");
			int usersal= sc.nextInt();
			sc.nextLine();
			System.out.println("사원커미션을 입력해 주세요");
			int usercomm= sc.nextInt();
			sc.nextLine();
			System.out.println("사원부서번호를 입력해 주세요");
			int userdeptno= sc.nextInt();
			sc.nextLine();
			
			//입력: insert
			String sqlInsert = "insert into emp values(SEQ_DEPT_DEPTNO.NEXTVAL, '"+userempno+"', '"+username+"', '"+userjob"')";
					//+"', '"+usermgr+"', '"+userhiredate+"', '"+usersal+"', '"+usercomm+"', '"+userdeptno+"')";
			int resultCnt = stmt.executeUpdate(sqlInsert);
			
			if(resultCnt>0) System.out.println("데이터가 정상적으로 입력되었습니다");
			
			
			//4. sql실행
			String sql = "select * from emp";
			ResultSet rs = stmt.executeQuery(sql);
			
			//5.resultset을 이용해서 결과 출력
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hiredate = rs.getString("hiredate");
				String sal = rs.getString("sal");
				String comm = rs.getString("comm");
				String deptno = rs.getNString("deptno");
				
				System.out.println(empno+"\t"+ename+"\t"+job+"\t"+mgr+"\t"+hiredate+"\t"+sal+"\t"+comm+"\t"+deptno);
				
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
