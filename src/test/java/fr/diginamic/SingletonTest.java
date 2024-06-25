package fr.diginamic;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import fr.diginamic.singleton.Singleton;

public class SingletonTest {

	private Singleton singleton;

	@Before
	public void setUp() {
		singleton = Singleton.getInstance();
	}

	@Test
	public void testInit() {
		HashMap<String, String> expected = new HashMap<>();
		
		expected.put("db.url", "jdbc:mysql://localhost:3306/mabase");
		expected.put("db.user", "root");
		expected.put("db.password", "1234");

		assertEquals(expected, singleton.getProprietes());
	}
}
