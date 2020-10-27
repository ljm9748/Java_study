package io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("print.txt"));
		
		out.printf("안녕하세요 저는 %d살 %s입니다.", 24, "이정민");
		out.print("aaa");
		out.println("ddd");
		out.close();
		
	}

}
 