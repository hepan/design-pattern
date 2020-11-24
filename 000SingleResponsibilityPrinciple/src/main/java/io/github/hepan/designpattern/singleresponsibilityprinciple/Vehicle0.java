package io.github.hepan.designpattern.singleresponsibilityprinciple;

/**
 * @author hp
 * @describe
 * @createTime 2020/11/17 19:07
 **/


public class Vehicle0 {
	public void run() {
		System.out.println("默认跑方法");
	}

	public static void main(String[] args) {
		LandVehicle car=new LandVehicle();
		AirVehicle plain =new AirVehicle();
		WaterVehicle ship=new WaterVehicle();

		car.run();
		plain.run();
		ship.run();
	}
}


class LandVehicle extends Vehicle0 {

	@Override
	public void run() {
		System.out.println("在路上跑。。。");
	}
}


class AirVehicle extends Vehicle0 {
	@Override
	public void run() {
		System.out.println("在天上飞。。。");
	}
}


class WaterVehicle extends Vehicle0 {
	@Override
	public void run() {
		System.out.println("在天上飞。。。");
	}
}

