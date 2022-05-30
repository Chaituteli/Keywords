package com.vstl.oops.Methodoverriding;

public class BMWCar extends Car {
	@Override
	public void Model() {
		//super.Model();
		System.out.println("BMW car model 2012");
	}
	@Override
    public void ColourofCar() {
		//super.ColourofCar();
    	System.out.println("colour is White");
    }
	@Override
	 public void Airbags() {
	    	System.out.println("Air bage is protection perpuse");
	    }
	public void wheelBase() {
			//super.ColourofCar();
	    	System.out.println("Wheel base is correct ");
	    }
}
