package io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("print.txt"));
		
		out.printf("�ȳ��ϼ��� ���� %d�� %s�Դϴ�.", 24, "������");
		out.print("aaa");
		out.println("ddd");
		out.close();
		
	}

}
 