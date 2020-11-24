package io.github.hepan.designpattern.singleresponsibilityprinciple;

/**
 * @author hp
 * @describe
 * @createTime 2020/11/17 19:01
 **/
public class Vehicle {
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.run();

		Vehicle ship = new Vehicle();
		ship.run();

	}


	public void run(){
		System.out.println("在路上跑.....");
	}
}
