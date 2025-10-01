package com.company.java013_ex;

interface Vehicle {
	public void run();
}

class MotorCycle implements Vehicle {
	@Override
	public void run() {
		System.out.println("오토바이가 달립니다.");
	}
}

class Car implements Vehicle {
	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
}

class Driver {void drive(Vehicle v) {v.run(); }}



//////////////////////////////////////
	public class InterFaceEx002 {
		   public static void main(String[] args) {
			   Driver driver = new Driver();
			      
			      Car car = new Car();
			      MotorCycle mo = new MotorCycle();
			      
			      driver.drive(car);// 자동차가 달립니다.
			      driver.drive(mo);//오토바이가 달립니다.
			   }
			}

//////////////////////////////////////