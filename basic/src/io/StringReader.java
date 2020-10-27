package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringReader {
	public static void main(String[] args) throws IOException {
		//���ڱ�� �⺻ ��Ʈ�� �ν��Ͻ� ����
		Reader reader= new FileReader("String.txt");
		//���ͽ�Ʈ�� BufferedReader�� �⺻ ��Ʈ�� �ʿ�
		BufferedReader in= new BufferedReader(reader);
		
		String str = null;
		while(true) {
			str =  in.readLine();
			if(str==null) {//�����������̶��: ���̻� ������ ���ڿ��� ����
				break;
			}
			System.out.println(str);
		}
		in.close();
	}
}
