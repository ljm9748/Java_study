package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}



	@Override 
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		
		/*
		if(age>o.age) {
			return 1;//전달받은 객체의 값이 작을때
		}else if(age<o.age) {
			return -1;//전달받은 객체의 값이 클때
		}else {
			return 0;
		}
		*/
		return age-o.age;
	}
	
	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<Person>();
		tset.add(new Person("son", 28));
		tset.add(new Person("lee", 24));
		tset.add(new Person("kim", 26));
		
		Iterator<Person> itr = tset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
