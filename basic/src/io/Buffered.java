package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Buffered {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//읽어올 대상 파일의 inputstream 인스턴스 생성
		InputStream in = new FileInputStream("org.pdf");
		OutputStream out = new FileOutputStream("orgcpy.pdf");
		//해당 경록에 파일없으면 생성해 출력 write
		//파일 있으면 덮어씀
		
		
		BufferedInputStream bin= new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		int copyByte=0; // 복사한 사이즈
		int bData=0;
		
		byte[] buf = new byte[1024];
		int readLength=0;
		
		while(true) {
			//bData = in.read(buf);
			readLength= in.read(buf);
			
			if(bData == -1) {
			if(readLength == -1) {
				break;
			}
			//out.write(bData);
			out.write(bData);
			copyByte++;
		}
		in.close();
		out.close();
		
		
		System.out.println("복사가 완료되었습니다. \n 복사된 사이즈: "+ copyByte +"*1024 byte");
	}

	}}
