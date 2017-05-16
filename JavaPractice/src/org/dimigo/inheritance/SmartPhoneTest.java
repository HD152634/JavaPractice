/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre> 
 * org.dimigo.inheritance
 * 	 |_  SmartPhoneTest 
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		SmartPhone p[] = new SmartPhone[]{
			new IPhone("iphone 7","애플",900000),
			new Galaxy("갤럭시 S8","삼성",800000)
		};
		
		for(int i=0; i<2; i++){
			System.out.println(p[i].toString());
			p[i].turnOn();
			p[i].pay();
			p[i].useSpecialFunction(p[i]);
			p[i].turnOff();
		System.out.println();
		}
	}

}
