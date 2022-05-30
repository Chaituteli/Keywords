package com.vstl.oops.Methodoverriding;

public class TestMethodOverriding {

	public static void main(String[] args) {
	//Method overriding
		
		Car objCar=new BMWCar();
		objCar.Model();
		objCar.ColourofCar();
		objCar.Airbags();
		objCar.fuel();
		//objCar.wheelBase() it is not paresnt in parent class so it give error.
		

	}

}
