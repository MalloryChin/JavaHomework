//Homework_05↓↓↓↓第4題↓↓↓↓
package Homework;

public class MyRectangleMain {

	public static void main(String[] args) {
		MyRectangle mr = new MyRectangle();
		mr.setWidth(10d);
		mr.setDepth(20d);
		System.out.println(mr.getArea());
		MyRectangle mr2 = new MyRectangle(10d,20d);
		System.out.println(mr2.getArea());
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


