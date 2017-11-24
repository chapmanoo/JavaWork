import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {
	Methods methods;
	Person person1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		methods = new Methods();
		person1 = new Person("Jim Dave", 21, "Fishmonger");
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void blackJackTest() {
		// blackJack(num1, num2);
		assertEquals("Result wasn't expected", 0, methods.blackJack(22, 22));
	}

	@Test
	public void uniqueSumTest() {
		assertEquals("Result wasn't expected", 3, methods.uniqueSum(1, 2, 1));
	}

	@Test
	public void tooHotTest() {
		assertTrue("Boolean is true", methods.tooHot(60, false));
		assertFalse("Boolean was false", methods.tooHot(100, false));
		assertTrue("Boolean was true", methods.tooHot(100, true));
		assertFalse("Boolean is False", methods.tooHot(55, false));
	}
	
	@Test
	public void addPersonTest()
	{		
		methods.addPerson(person1);
		assertTrue("Person was added", (methods.getPerson(0) == person1));
	}
	
	@Test
	public void findPersonTest()
	{	
		methods.addPerson(person1);
		Person found = methods.searchArray("Jim Dave");
		assertTrue("Person found)", found.equals(person1));
		
	}
	
	@Test 
	public void mathFuncBoolTRUEToAdd()
	{
		assertEquals("Actual was expected", 6, methods.mathFuncBoolTRUEToAdd(3, 3, true));
		assertEquals("Actual was expected", 6, methods.mathFuncBoolTRUEToAdd(2, 3, false));
	}

}