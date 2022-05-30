package com.vstl.oops.superExample;

public class OmHospital {

	String  strDoctors="Dr M.D.Mohite ";
	String strspecialist="Heart specialist";
	
	public void getHospitalName() {
		System.out.println("My Hospital Name is :"+ "Om Hospital Kolhapur" );
	}

	public OmHospital(int intCapacity) {
		System.out.println("Hospital Bed Capacity :"+intCapacity );
	}
	public void getHospitalMobileNo() {
		System.out.println(" Doctor Mobile no :"+ "9484939210");
	}
	public void Details(String  strDoctors ,String strspecialist ) {
		
		System.out.println("Hospital Doctors name :"+  strDoctors);
		System.out.println(" Specialist  :"+  strspecialist);
	}

	
}
