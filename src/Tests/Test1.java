package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Hero;

/**
 * @author Halmar Arteaga - harteagabran
 * CIS175 - Spring 2024
 * Jan 18, 2024
 */
public class Test1 {
	private Hero hero = new Hero("Hector");
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNameNotNull() {
		assertNotNull(hero.getName());
	}
	
	@Test
	public void testHealthNotAboveMax() {
		hero.setMax(60);
		hero.setHealth(90);
		
		assertEquals(60, hero.getHealth());
	}

}
