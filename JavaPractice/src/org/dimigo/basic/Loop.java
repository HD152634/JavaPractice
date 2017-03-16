/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre> 
 * org.dimigo.basic
 * 	 |_  Loop 
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int choice;
		int attack=100;
		String[] people = {"마법사","영주","기사","농민"};

	
		do{
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("-------------");
			System.out.printf("메뉴 입력 => ");
		Scanner scanner = new Scanner(System.in);

		choice = scanner.nextInt();	
		if(choice==1){
			attack += 10;
			System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",attack);
		}
		else if(choice==2){
			attack -=10;
			System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",attack);
		}
		else if(choice==3){
			int num = new Random().nextInt(4);
			System.out.printf("%s(으)로 설정되었습니다.\n",people[num]);
		}
		else if(choice ==9){
			System.out.println("이제 공부하세요!\n");
			scanner.close();
		}
		else System.out.println("없는 메뉴입니다.\n");
		}while(choice != 9);
		}

}
