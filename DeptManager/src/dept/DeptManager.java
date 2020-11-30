package dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class DeptManager {

	//사용자 입력
	
	Scanner sc = new Scanner(System.in);
	
	DeptDao dao = DeptDao.getInstance();
	//부서입력 메소드: 사용자에게 입력받은 데이터를 DAO를 이용해서 DB입력
	
	void insertDept() {
		// 부서정보를 받아서 인스턴스를 생성하고 dao.insertDept()
		System.out.println("부서정보를 입력합니다.");
		System.out.println("부서번호를 입력해주세요.");
		String deptno = sc.nextLine();
		System.out.println("부서이름ㅁ을 입력해주세요.");
		String dname = sc.nextLine();
		System.out.println("지역이름을 입력해주세요.");
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
		
		if(resultCnt>0) System.out.println("입력되었습니다.");
		else System.out.println("입력에 실패했습니다.");
		
		
	}
	
	//부서 정보수정 메소드: 사용자에게 입력받고 데이터를 DAO를 이용해서 수정
	void editDept() {
		System.out.println("수정을 원하시는 부서번호를 입력해주세요");
		String deptno = sc.nextLine();
		System.out.println("새로운 부서 이름을 입력해주세요. ");
		String dname = sc.nextLine();
		System.out.println("새로운 지역 이름을 입력해주세요.");
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
		if(resultCnt>0) System.out.println("수정되었습니다.");
		else System.out.println("수정에 실패했습니다.");
		 
	}
	void deleteDept() {

		System.out.println("삭제를 원하시는 부서번호를 입력해주세요");
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
		if(resultCnt>0) System.out.println("삭제되었습니다.");
		else System.out.println("삭제에 실패했습니다.");
		 
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
		
		if(list.isEmpty()) System.out.println("저장된 정보가 없습니다.");
		else {
			for(Dept d:list) {
				System.out.println(d);
			}
		}
	
	}
	void searchDept() {

		System.out.println("부서를 검색합니다");
		System.out.println("찾으시는 부서번호를 입력해주세요");
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
		else System.out.println("찾으시는 정보가 없습니다");
		
	}
	
	
}
