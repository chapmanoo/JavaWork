import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcRunnerTest {

	Methods methods;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		methods = new Methods();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isMultipliableTest() {
		
		assertTrue("Result wasn't expected", methods.checkMultiply("4, 2, 8"));
		assertFalse("Result wasn't expected", methods.checkMultiply("6, 22, 12"));
		assertTrue("Result wasn't expected", methods.checkMultiply("6, 2, 3"));
		assertTrue("Result wasn't expected", methods.checkMultiply("9, 12, 108"));
		assertTrue("Result wasn't expected", methods.checkMultiply("4, 16, 64"));
		
	}
	
	@Test
	public void isAddableTest() {
		
		assertFalse("Result wasn't expected", methods.checkAddition("4, 2, 8"));
		assertFalse("Result wasn't expected", methods.checkAddition("6, 22, 12"));
		assertFalse("Result wasn't expected", methods.checkAddition("6, 2, 3"));
		assertFalse("Result wasn't expected", methods.checkAddition("9, 12, 108"));
		assertFalse("Result wasn't expected", methods.checkAddition("4, 16, 64"));
	}
	
	@Test
	public void isSubtractableTest() {
		
		assertTrue("Result wasn't expectedA", methods.checkSubtraction("4, 2, 6"));
		assertFalse("Result wasn't expectedB", methods.checkSubtraction("6, 22, 12"));
		assertFalse("Result wasn't expectedC", methods.checkSubtraction("6, 2, 3"));
		assertFalse("Result wasn't expectedD", methods.checkSubtraction("9, 12, 108"));
		assertFalse("Result wasn't expectedE", methods.checkSubtraction("4, 16, 64"));
	}
	
	@Test
	public void isDividableTest() {
		
		assertTrue("Result wasn't expected", methods.checkDivide("4, 2, 8"));
		assertFalse("Result wasn't expected", methods.checkDivide("6, 22, 12"));
		assertTrue("Result wasn't expected", methods.checkDivide("6, 2, 3"));
		assertTrue("Result wasn't expected", methods.checkDivide("9, 12, 108"));
		assertTrue("Result wasn't expected", methods.checkDivide("4, 16, 64"));
				
	}

}
