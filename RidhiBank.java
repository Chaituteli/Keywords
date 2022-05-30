package com.vstl.oops.finalExample;

public class RidhiBank extends ICICBank{

	public final int totalcash=20000000;
	public final int WithDrawal=40000 ;
	int intmin=500;
	
	public void gettotalBalance() {
		//totalcash=23000000;  it is not possible
		//System.out.println("Total Balance in Ridhi bank :"+totalcash);
		super.gettotalBalance();
		System.out.println("Total Balance in Ridhi bank :"+totalcash);
	}
	
	public void getWithDrawalAmount() {
		super.getWithDrawalAmount();
		System.out.println("With Drawal Amount per Day:"+WithDrawal);
	}
	//we does not override the final method
	public void getBankIFFCCode(String strBankName,String strBankCode) {
		strBankName="Ridhi";
		strBankCode="4563";
		String strIFFCCode=strBankName+strBankCode;
		System.out.println("IFFC code:"+ strIFFCCode);
	} 

		
	} 

