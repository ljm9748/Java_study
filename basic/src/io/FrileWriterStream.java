package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FrileWriterStream {
	public static void main(String[] args) throws IOException {
		Writer out = new FileWriter ("paper.txt");
		
		out.write('A'); // int�� �ڵ� ����ȯ
		
		out.close();
		System.out.println("������ �����Ǿ����ϴ�");
		
	}

}
