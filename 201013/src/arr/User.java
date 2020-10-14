package arr;

public class User {
	int id;
	String name;
	
	//생성자
	User(int id, String name){
		this.id=id;
		this.name=name;
	}

	void showData() {
		System.out.println(id+"번: "+name);
	}
}
