package io.github.hepan.ocp;

/**
 * @author hp
 * @describe
 * @createTime 2020/11/19 16:00
 **/
public class Ocp {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Circle c = new Circle();

		Draw d= new Draw();
		d.draw(r);
		d.draw(c);
	}
}


class Draw {
	public void draw(Shape shape) {
		if (shape.type == 1) {
			drawRectangle();
		} else if (shape.type == 2) {
			drawCircle();
		}
	}
	public void drawRectangle() {
		System.out.println("矩形");
	}
	public void drawCircle() {
		System.out.println("原型");
	}
}


class Shape {
	int type;
}
class Rectangle extends Shape {
	Rectangle() {
		super.type = 1;
	}
}
class Circle extends Shape {
	Circle() {
		super.type = 2;
	}
}