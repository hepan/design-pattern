package io.github.hepan.ocp.improve;


/**
 * @author hp
 * @describe
 * @createTime 2020/11/24 12:38
 **/
public class OcpImprove {
	public static void main(String[] args) {
		GEditer gEditer=new GEditer();
		gEditer.draw(new Rectangle());
		gEditer.draw(new Circle());
	}

}

class GEditer {
	public void draw(Shape shape) {
		shape.draw();
	}

}


interface Shape {
	void draw();
}

class Rectangle implements Shape {


	public void draw() {
		System.out.println("画一个方形");
	}
}

class Circle implements Shape {
	public void draw() {
		System.out.println("画一个圆形");
	}
}