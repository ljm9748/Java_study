package dept;

public class DeptMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DeptManager manager = new DeptManager();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//manager.insertDept();
			//manager.editDept();
			//manager.deleteDept();
			manager.listDept();
			//manager.searchDept();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
