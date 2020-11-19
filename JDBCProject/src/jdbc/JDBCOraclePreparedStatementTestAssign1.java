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
			
			System.out.println("����� �Է��� �ּ���");
			int userempno= sc.nextInt();
			sc.nextLine();
			System.out.println("����̸��� �Է��� �ּ���");
			String username= sc.nextLine();
			System.out.println("��������� �Է��� �ּ���");
			String userjob= sc.nextLine();
			
			System.out.println("����ǻ�� ��ȣ�� �Է��� �ּ���");
			int usermgr= sc.nextInt();
			sc.nextLine();
			Calendar userhiredate = Calendar.getInstance();
			System.out.println("�ӱ��� �Է��� �ּ���");
			int usersal= sc.nextInt();
			sc.nextLine();
			System.out.println("���Ŀ�̼��� �Է��� �ּ���");
			int usercomm= sc.nextInt();
			sc.nextLine();
			System.out.println("����μ���ȣ�� �Է��� �ּ���");
			int userdeptno= sc.nextInt();
			sc.nextLine();
			
			//�Է�: insert
			String sqlInsert = "insert into emp values(SEQ_DEPT_DEPTNO.NEXTVAL, '"+userempno+"', '"+username+"', '"+userjob"')";
					//+"', '"+usermgr+"', '"+userhiredate+"', '"+usersal+"', '"+usercomm+"', '"+userdeptno+"')";
			int resultCnt = stmt.executeUpdate(sqlInsert);
			
			if(resultCnt>0) System.out.println("�����Ͱ� ���������� �ԷµǾ����ϴ�");
			
			
			//4. sql����
			String sql = "select * from emp";
			ResultSet rs = stmt.executeQuery(sql);
			
			//5.resultset�� �̿��ؼ� ��� ���
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
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
