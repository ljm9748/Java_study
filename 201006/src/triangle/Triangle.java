package triangle;

public class Triangle {

	float bottom, height;
	
	float area() {
		return (float)bottom*height/2;
	}
	void changeHeight(float newHeight) {
		height=newHeight;
	}
	void changeBottom(float newBottom) {
		bottom=newBottom;
	}
}
