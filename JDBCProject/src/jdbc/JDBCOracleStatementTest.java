package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCOracleStatementTest {
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
			
			//PreparedStatement �ν��Ͻ� ����: sql ���� ����ϰ� ����Ѵ�
			String sqlInsert = "insert into dept values(seq_dept_deptno.nextval,?,?)";
			PreparedStatement pstmt = null;
			pstmt= conn.prepareStatement(sqlInsert);
			pstmt.setNString(1, userDname);
			pstmt.setNString(2, userLoc);
			
			int resultCnt = pstmt.executeUpdate();
			if(resultCnt>0) {
				System.out.println("�����Ͱ� ���������� �ԷµǾ����ϴ�.");
			}else {
				System.out.println("������ �Է��� ���� �ʾҽ��ϴ�.");
			}
			
			System.out.println("�˻��ϰ��� �ϴ� �μ��� �̸��� �Է����ּ���");
			String searchDname = sc.nextLine();
			String sqlSelect = "select * from dept where dname=? order by loc";
			
			//�μ� ���� ����Ʈ
			//String sqlSelect = "select * from dept order by loc";
			pstmt = conn.prepareStatement(sqlSelect);
			pstmt.setString(1, searchDname);
			ResultSet rs = pstmt.executeQuery();
			
			if(!rs.next()) System.out.println("�˻��� ����� �����ϴ�");
				do {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\n");
				
			}while (rs.next());
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
