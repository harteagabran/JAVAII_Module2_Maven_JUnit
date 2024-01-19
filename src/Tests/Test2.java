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
public class Test2 {
	private Hero hero = new Hero("Eirika");
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsDown() {
		hero.setHealth(0);
		
		assertTrue(hero.isDown());
	}
	
	@Test
	public void testIsNotDown() {
		hero.setHealth(1);
		
		assertFalse(hero.isDown());
	}

}
