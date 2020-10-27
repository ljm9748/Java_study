package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PersonInfo implements Serializable{
	
	String name;
	transient String secretInfo;
	int age;
	transient int secretNum;
	
	public PersonInfo(String name, String secretInfo, int age, int secretNum) {
		super();
		this.name = name;
		this.secretInfo = secretInfo;
		this.age = age;
		this.secretNum = secretNum;
	}
	
	public void showInfo() {
		System.out.println("name: "+name);
		System.out.println("secreatInfo: "+secretInfo);
		System.out.println("age: "+age);
		System.out.println("secreatNum: "+secretNum);
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		//�ν��Ͻ� ���� ��Ʈ�� ����
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Personinfo.ser"));
		
		PersonInfo info = new PersonInfo("��", "00000",30, 11);
		info.showInfo();
		
		//�ν��Ͻ� ����
		out.writeObject(info);
		out.close();
		
		//�ν��Ͻ� ���� ������ ���� ��Ʈ�� ����
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Personinfo.ser"));
		
		//����
		PersonInfo reinfo = (PersonInfo) in.readObject();
	}

}
