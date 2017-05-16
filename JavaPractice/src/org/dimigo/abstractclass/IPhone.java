/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre> 
 * org.dimigo.inheritance
 * 	 |_  Iphone 
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class IPhone extends SmartPhone {
	IPhone(){}
	
	IPhone(String model,String company,int price){
		super.model = model;
		super.company = company;
		super.price = price;
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다");
	}
	public void useAirDrop(){
		System.out.println("AirDrop기능을 사용합니다");
	}
}
