package com.vstl.oops.finalExample;

public class ICICBank {

	//final Variable
	public final int totalcash=10000000;
	public final int WithDrawal=50000 ;
	
	public void gettotalBalance() {
		System.out.println("Total Balance in ICIC bank :"+totalcash);
	}
	
	public void getWithDrawalAmount() {
		System.out.println("With Drawal Amount per Day:"+WithDrawal);
	} 
	//final method
	public  final void getBankIFFCCode() {
		System.out.println("Bank IFFC Code is ICIC133424");
	} 
}
//when we create final class then it is does not override and extends also.