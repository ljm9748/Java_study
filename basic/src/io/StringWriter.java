package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StringWriter {
	public static void main(String[] args) throws IOException {
		//필터 스트림: bufferedwriter 기폰 스트림 writer가 필요
		Writer writer = new FileWriter("String.txt");
		BufferedWriter out = new BufferedWriter(writer);
		
		out.write("안녕반가워 나는 정민이야");
		out.newLine();//개행
		out.write("하이하이");
		out.newLine();//개행
		out.newLine();//개행
		out.newLine();//개행
		out.write("끝");
		
		out.close();
		
	}

}
