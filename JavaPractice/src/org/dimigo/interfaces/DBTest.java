/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre> 
 * org.dimigo.interfaces
 * 	 |_  DBTest 
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author		: hana4
 * @version		: 1.0
 */
public class DBTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<변경 전>>");
		IDBManager database = IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		crud(database);
		System.out.println("\n<<변경 후>>");
		IDBManager database1 = IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		crud(database1);
		
	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
	

} 
