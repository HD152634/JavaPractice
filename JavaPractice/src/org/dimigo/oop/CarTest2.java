/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre> 
 * org.dimigo.oop
 * 	 |_  CarTest 
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car2 car = new Car2("현대자동차","제네시스","검정색",225,50000000);

		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 :" + car.getCompany());
		System.out.println("모델명 :" + car.getModel());
		System.out.println("색상 :" +car.getColor());
		System.out.println("최대속도 :"+ car.getMaxSpeed()+"km");
		System.out.printf("가격: %s원",String.format("%,d",car.getPrice()));
		//System.out.println("가격: %d"+car.getPrice()+"원");
	
		System.out.printf("\n\n");
		
		Car2 car2 = new Car2("기아자동차","k7","흰색",246,40000000);
		/*car2.setCompany("기아자동차");
		car2.setModel("k7");
		car2.setColor("흰색");
		car2.setMaxSpeed(246);
		car2.setPrice(40000000);*/
		
		System.out.println("제조사명 :" + car2.getCompany());
		System.out.println("모델명 :" + car2.getModel());
		System.out.println("색상 :" + car2.getColor());
		System.out.println("최대속도:"+ car2.getMaxSpeed()+"km");
		System.out.printf("가격: %s원",String.format("%,d",car2.getPrice()));
	
		System.out.printf("\n\n");
		
		Car2 car3 = new Car2("삼성자동차","SM7","회색",200,38000000);
		/*car3.setCompany("삼성자동차");
		car3.setModel("SM7");
		car3.setColor("회색");
		car3.setMaxSpeed(200);
		car3.setPrice(38000000);*/
		
		System.out.println("제조사명 :" + car3.getCompany());
		System.out.println("모델명 :" + car3.getModel());
		System.out.println("색상 :" + car3.getColor());
		System.out.println("최대속도:"+ car3.getMaxSpeed()+"km");
		System.out.printf("가격: %s원",String.format("%,d",car3.getPrice()));
	}

}
