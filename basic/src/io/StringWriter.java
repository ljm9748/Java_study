package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		//���� ��Ʈ��: bufferedwriter ���� ��Ʈ�� writer�� �ʿ�
		Writer writer = new FileWriter("String.txt");
		BufferedWriter out = new BufferedWriter(writer);
		
		out.write("�ȳ�ݰ��� ���� �����̾�");
		out.newLine();//����
		out.write("��������");
		out.newLine();//����
		out.newLine();//����
		out.newLine();//����
		out.write("��");
		
		out.close();
		
	}

}
