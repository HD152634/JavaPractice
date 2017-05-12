/**
 * 
 */
package org.dimigo.inheritance;

import java.util.GregorianCalendar;


/**
 * <pre> 
 * org.dimigo.inheritance
 * 	 |_  PersonTest 
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	
	public static void greeting(Person p){
		p.sayHello();
		p.sayBye();
	}
	
	public static void main(String[] args) {

		/*Person a = new Person("Tom");
		Korean b = new Korean("홍길동");
		Japanese c = new Japanese("다나카");
		Chinese d= new Chinese("왕밍");*/
		
		
		Person person[] = new Person[]{
			new Person("Tom"),
			new Korean("홍길동"),
			new Japanese("다나카"),
			new Chinese("왕밍")
		};
		
		for(Person p : person){
			System.out.println(p);
			greeting(p);
			System.out.println();
		}
		
		
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.printf("\n");
		
		a.sayHello();
		b.sayHello();
		c.sayHello();
		d.sayHello();
		System.out.printf("\n");
		
		a.sayBye();
		b.sayBye();
		c.sayBye();
		d.sayBye();
		System.out.printf("\n");
		
		*/
	}

}
