package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteofFileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�о�� ��� ������ inputstream �ν��Ͻ� ����
		InputStream in = new FileInputStream("org.pdf");
		OutputStream out = new FileOutputStream("orgcpy.pdf");
		//�ش� ��Ͽ� ���Ͼ����� ������ ��� write
		//���� ������ ���
		
		int copyByte=0; // ������ ������
		int bData=0;
		
		byte[] buf = new byte[1024];
		int readLength=0;
		
		while(true) {
			//bData = in.read(buf);
			readLength= in.read(buf);
			
			//if(bData == -1) {
			if(readLength == -1) {
				break;
			}
			//out.write(bData);
			out.write(readLength);
			copyByte++;
		}
		in.close();
		out.close();
		
		
		System.out.println("���簡 �Ϸ�Ǿ����ϴ�. \n ����� ������: "+ copyByte +"*1024 byte");
	}

}
