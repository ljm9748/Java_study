package arr;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1=new User(1, "King");
		User[]  Users=new User[10];
		String tmp;
		for (int i = 1; i <= Users.length; i++) {
			tmp= "»ç¿ëÀÚ" + i;
			Users[i-1]=new User(i, tmp);
		}
		for (int i = 0; i < Users.length; i++) {
			Users[i].showData();
		}

	}

}
