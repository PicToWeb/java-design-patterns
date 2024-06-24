package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class FactoryTest {
	
	
	@Test
	public void testVerifierAdditif() {
		
		
		Element additif = ElementFactory.getInstance(ElementType.ADDITIF, "farine", 50, Unite.MICRO_GRAMMES);

		
		Additif adControl = new Additif("farine",50,Unite.MICRO_GRAMMES);
		
		assertTrue(additif instanceof Additif);
		assertEquals(additif.getName(), adControl.getName());
		assertEquals(additif.getUnite(), adControl.getUnite());
		assertEquals(additif.getValue(), adControl.getValue());
		assertEquals(additif.getClass(), adControl.getClass());
		
	}
	
	@Test
	public void testVerifierIngredient() {
		
		Element ingred = ElementFactory.getInstance(ElementType.INGREDIENT, "farine", 50, Unite.MICRO_GRAMMES);

		
		Ingredient adControl = new Ingredient("farine",50,Unite.MICRO_GRAMMES);
		
		assertEquals(ingred.getName(), adControl.getName());
		assertEquals(ingred.getUnite(), adControl.getUnite());
		assertEquals(ingred.getValue(), adControl.getValue());
		assertEquals(ingred.getClass(), adControl.getClass());
		
	}
	@Test
	public void testVerifierIngredientNotOk() {
		
		Element ingred = ElementFactory.getInstance(ElementType.ADDITIF, "farine", 50, Unite.MICRO_GRAMMES);

		
		Additif adControl = new Additif("farine",50,Unite.MICRO_GRAMMES);
		
		assertEquals(ingred.getName(), adControl.getName());
		assertEquals(ingred.getUnite(), adControl.getUnite());
		assertEquals(ingred.getValue(), adControl.getValue());
		assertEquals(ingred.getClass(), adControl.getClass());
		
	}
	
	@Test
	public void testVerifierAllergene() {
		
		Element ingred = ElementFactory.getInstance(ElementType.ALLERGENE, "farine", 50, Unite.MICRO_GRAMMES);

		
		Allergene adControl = new Allergene("farine",50,Unite.MICRO_GRAMMES);
		
		assertEquals(ingred.getName(), adControl.getName());
		assertEquals(ingred.getUnite(), adControl.getUnite());
		assertEquals(ingred.getValue(), adControl.getValue());
		assertEquals(ingred.getClass(), adControl.getClass());
		
	}

}
