/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre> 
 * org.dimigo.basic
 * 	 |_  PrimitiveDataType 
 *
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<< 아이유 프로필 >>\n");
		
		String name = "아이유";
		//System.out.println(name);
		System.out.printf("이름 : %s\n",name);
		
		boolean flag = true;
		System.out.println(flag ? "성별 : 여자" : "남자");
		
		int age = 25;
		//System.out.println(age);
		System.out.printf("나이 : %d세\n",age);
		
		double height = 161.8;
		//System.out.println(height);
		System.out.printf("키 : %.1fcm\n",height);
		
		float weight = 44.3f;
		//System.out.println(weight);
		System.out.printf("몸무게 : %.1fkg\n",weight);
		
		char bloodtype = 'A';
		//System.out.println(bloodtype);
		System.out.printf("혈액형 : %c형\n",bloodtype);

	}

}
