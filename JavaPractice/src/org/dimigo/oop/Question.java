/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre> 
 * org.dimigo.oop
 * 	 |_  Question 
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[]questions = {"가장 좋아하는 가수는? ","가장 좋아하는 배우는? ","가장 좋아하는 과목은? "};
		String[]answer = {"방탄","조정석","문학"};
		
		Scanner scanner = new Scanner(System.in);
	

		for(int i=0; i<3; i++){
			System.out.println(i+1+"."+questions[i]);
			String answers = scanner.nextLine();
			if(answer[i].equals(answers)){
				System.out.println("정답입니다");
			}
			else System.out.println("틀렸습니다");
		}
	System.out.println("<<결과출력>>");
	StringBuilder sb= new StringBuilder();
	for(int i=0; i<3; i++){
		sb.append(questions[i]).append(answer[i]).append("입니다.\n");
	}
	System.out.println(sb);
	}
}
