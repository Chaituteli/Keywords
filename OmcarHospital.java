package com.vstl.oops.superExample;

public class OmcarHospital extends OmHospital {
	String  strDoctors="Dr S.D,Vernekar ";
	String strspecialist=" specialist";
	
	public void getHospitalName() {
		super.getHospitalName();//super access Method
		System.out.println("My Hospital Name is :"+ "Omcar Hospital pune" );
	}

	public  OmcarHospital() {
		super(450);// super access Constructors
		System.out.println("Hospital Bed Capacity :"+ 250 );
	}
	public void getHospitalMobileNo() {
		super.getHospitalMobileNo();//super access Method
		System.out.println(" Doctor Mobile no :"+ "7020456781");
	}
	public void Details(String  strDoctors ,String strspecialist) {
		//Access super variable
		
		strDoctors=super.strDoctors;
		
		System.out.println("Hospital Doctors name :"+ strDoctors);
		strspecialist=super.strspecialist;
		
		System.out.println("Hospital Doctors name :"+ strspecialist);
	}
}
