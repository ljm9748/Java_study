package io;

import java.io.Serializable;

public class Circle2 implements Serializable{
	
	transient int point;//����ȭ ��󿡼� ����
	int xPos;
	int yPos;
	double rad;
	
	public Circle2(int xPos, int yPos, double rad) {
		this.xPos=xPos;
		this.yPos=yPos;
		this.rad=rad;
		
	}

	
	public void showCircleInfo() {
		System.out.printf("[%d, %d] \n", xPos, yPos);
		System.out.println("rad: "+rad);
	}
}
