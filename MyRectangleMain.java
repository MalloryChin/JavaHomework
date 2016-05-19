package Homework;

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class MyRectangle{
	private double width, depth;
	public MyRectangle(){
		
	}
	public MyRectangle(double width, double depth){
		this.width = width;
		this.depth = depth;
	}
	void setWidth(double width){
		this.width = width;
	}
	void setDepth(double depth){
		this.depth = depth;
	}
	double getArea(){
		return (width * depth);
	}
}


