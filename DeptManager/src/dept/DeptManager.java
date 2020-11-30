package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptManager {

	//����� �Է�
	
	Scanner sc = new Scanner(System.in);
	
	DeptDao dao = DeptDao.getInstance();
	//�μ��Է� �޼ҵ�: ����ڿ��� �Է¹��� �����͸� DAO�� �̿��ؼ� DB�Է�
	
	void insertDept() {
		// �μ������� �޾Ƽ� �ν��Ͻ��� �����ϰ� dao.insertDept()
		System.out.println("�μ������� �Է��մϴ�.");
		System.out.println("�μ���ȣ�� �Է����ּ���.");
		String deptno = sc.nextLine();
		System.out.println("�μ��̸����� �Է����ּ���.");
		String dname = sc.nextLine();
		System.out.println("�����̸��� �Է����ּ���.");
		String loc = sc.nextLine();
		
		Dept dept = new Dept(Integer.parseInt(deptno), dname, loc);
		
		Connection conn = null;

		
		int resultCnt=0;
		try {
			conn= ConnectionProvider.getConnection();
			resultCnt=dao.insertDept(dept, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(resultCnt>0) System.out.println("�ԷµǾ����ϴ�.");
		else System.out.println("�Է¿� �����߽��ϴ�.");
		
		
	}
	
	//�μ� �������� �޼ҵ�: ����ڿ��� �Է¹ް� �����͸� DAO�� �̿��ؼ� ����
	void editDept() {
		System.out.println("������ ���Ͻô� �μ���ȣ�� �Է����ּ���");
		String deptno = sc.nextLine();
		System.out.println("���ο� �μ� �̸��� �Է����ּ���. ");
		String dname = sc.nextLine();
		System.out.println("���ο� ���� �̸��� �Է����ּ���.");
		String loc = sc.nextLine();
		
		Dept dept = new Dept(Integer.parseInt(deptno), dname, loc);
		
		Connection conn = null;

		int resultCnt=0;
		try {
			conn= ConnectionProvider.getConnection();
			resultCnt=dao.updateDept(dept, conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(resultCnt>0) System.out.println("�����Ǿ����ϴ�.");
		else System.out.println("������ �����߽��ϴ�.");
		 
	}
	void deleteDept() {

		System.out.println("������ ���Ͻô� �μ���ȣ�� �Է����ּ���");
		String deptno = sc.nextLine();

		
		//Dept dept = new Dept(Integer.parseInt(deptno), dname, loc);
		
		Connection conn = null;
		
		int resultCnt=0;
		try {
			conn= ConnectionProvider.getConnection();
			resultCnt=dao.deleteDept(Integer.parseInt(deptno), conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(resultCnt>0) System.out.println("�����Ǿ����ϴ�.");
		else System.out.println("������ �����߽��ϴ�.");
		 
	}
	void listDept() {


		//Dept dept = new Dept(Integer.parseInt(deptno), dname, loc);
		
		Connection conn = null;
		List<Dept> list = null;
		int resultCnt=0;
		try {
			conn= ConnectionProvider.getConnection();
			list = dao.listDept(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(list.isEmpty()) System.out.println("����� ������ �����ϴ�.");
		else {
			for(Dept d:list) {
				System.out.println(d);
			}
		}
	
	}
	void searchDept() {

		System.out.println("�μ��� �˻��մϴ�");
		System.out.println("ã���ô� �μ���ȣ�� �Է����ּ���");
		String deptno = sc.nextLine();


		
		Connection conn = null;

		Dept dept= null;
		try {
			conn= ConnectionProvider.getConnection();
			dept=dao.searchDept(Integer.parseInt(deptno), conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(dept!=null) System.out.println("?"+dept);
		else System.out.println("ã���ô� ������ �����ϴ�");
		
	}
	
	
}
