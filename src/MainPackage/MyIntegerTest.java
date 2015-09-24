/**
 * 
 */
package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author GE60
 *
 */
public class MyIntegerTest {
	
	private static MyInteger myIntEven;
	private static MyInteger myIntOdd;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myIntEven = new MyInteger(2);
		myIntOdd = new MyInteger(3);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		
		assertTrue(myIntEven.isEven() == true);
		assertTrue(myIntEven.isEven() == false);
		assertFalse(myIntOdd.isEven()==true);
		
		assertTrue(myIntEven.isOdd() == false);
		assertTrue(myIntEven.isOdd() == true);
		assertFalse(myIntOdd.isOdd()==false);
		
		
		
		
	}

}
