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
		//1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Load!!");
			
			//2. db�� ���� == 127.0.0.1
			String jdbcUrl="jdbc:oracle:thin:@localhost:1521:orcl";
			String user= "scott";
			String password="tiger";
			
			conn= DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("�����ͺ��̽��� �����߽��ϴ�.");
			
			//STATEMENT �ν��Ͻ� ����
			Statement stmt = conn.createStatement();
			
			System.out.println("�μ��̸��� �Է��� �ּ���");
			String userDname= sc.nextLine();
			System.out.println("�μ���ġ�� �Է��� �ּ���");
			String userLoc= sc.nextLine();
			
			//�Է�: insert
			String sqlInsert = "insert into dept values(SEQ_DEPT_DEPTNO.NEXTVAL, '"+userDname+"', '"+userLoc+"')";
			int resultCnt = stmt.executeUpdate(sqlInsert);
			
			if(resultCnt>0) System.out.println("�����Ͱ� ���������� �ԷµǾ����ϴ�");
			
			//4. sql����
			String sql = "select * from dept order by deptno";
			ResultSet rs = stmt.executeQuery(sql);
			
			//5.resultset�� �̿��ؼ� ��� ���
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
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
