package io.github.hepan.designpattern.singleresponsibilityprinciple;

/**
 * @author hp
 * @describe
 * @createTime 2020/11/17 19:27
 **/
public class Vehicle1 {
	public void waterRun(){
		System.out.println("水中游...");
	}
	public void airRun(){
		System.out.println("天上飞...");
	}
	public void landRun(){
		System.out.println("路上跑...");
	}


	public static void main(String[] args) {
		Vehicle1 car=new Vehicle1();
		Vehicle1 plain =new Vehicle1();
		Vehicle1 ship=new Vehicle1();

		car.landRun();
		plain.airRun();
		ship.waterRun();
	}
}
