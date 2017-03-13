/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre> 
 * org.dimigo.basic
 * 	 |_  Operator 
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int salary = 1700000;
		int man = 3;
		int store = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : %s원\n",String.format("%,d",salary));
		System.out.printf("점포 내 직원수 : %s명\n",String.format("%,d",man));
		System.out.printf("점포 수 : %s개\n",String.format("%,d",store));
		
		System.out.printf("\n\n연간 인건비 : %s원",String.format("%,d",(long)12*salary*man*store));
		
		

	}

}
