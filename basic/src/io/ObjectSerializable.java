package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializable {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//�ν��Ͻ� ������ ���� ��Ʈ�� ����
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
		
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle2(2, 2, 4.8));
		out.writeObject(new String("String class implements Serializable"));
		
		System.out.println("�ν��Ͻ� ���� ����!");
		out.close();
		
		//�ν��Ͻ� ����
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
		
		Object o1= (in.readObject());
		Circle c1=null;
		if(o1 instanceof Circle) {
			c1= (Circle) o1;
		}

		Circle c2= (Circle) in.readObject();
		String str= (String) in.readObject();
		
		Object o2= in.readObject();
		Circle c3=null;
		if(o2 instanceof Circle2) {
			c3= (Circle) o2;
		}
		
	}

}
