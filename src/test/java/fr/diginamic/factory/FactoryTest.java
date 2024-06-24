package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FactoryTest {
	
	
	@Test
	public void testVerifierAdditif() {
		
		ElementFactory facto = new ElementFactory();
		Element additif = facto.createElement(ElementType.ADDITIF, "farine", 50, Unite.MICRO_GRAMMES);

		
		Additif adControl = new Additif("farine",50,Unite.MICRO_GRAMMES);
		
		assertEquals(additif.getName(), adControl.getName());
		assertEquals(additif.getUnite(), adControl.getUnite());
		assertEquals(additif.getValue(), adControl.getValue());
		assertEquals(additif.getClass(), adControl.getClass());
		
	}
	
	@Test
	public void testVerifierIngredient() {
		
		ElementFactory facto = new ElementFactory();
		Element ingred = facto.createElement(ElementType.INGREDIENT, "farine", 50, Unite.MICRO_GRAMMES);

		
		Ingredient adControl = new Ingredient("farine",50,Unite.MICRO_GRAMMES);
		
		assertEquals(ingred.getName(), adControl.getName());
		assertEquals(ingred.getUnite(), adControl.getUnite());
		assertEquals(ingred.getValue(), adControl.getValue());
		assertEquals(ingred.getClass(), adControl.getClass());
		
	}
	@Test
	public void testVerifierIngredientNotOk() {
		
		ElementFactory facto = new ElementFactory();
		Element ingred = facto.createElement(ElementType.ADDITIF, "farine", 50, Unite.MICRO_GRAMMES);

		
		Additif adControl = new Additif("farine",50,Unite.MICRO_GRAMMES);
		
		assertEquals(ingred.getName(), adControl.getName());
		assertEquals(ingred.getUnite(), adControl.getUnite());
		assertEquals(ingred.getValue(), adControl.getValue());
		assertEquals(ingred.getClass(), adControl.getClass());
		
	}
	
	@Test
	public void testVerifierAllergene() {
		
		ElementFactory facto = new ElementFactory();
		Element ingred = facto.createElement(ElementType.ALLERGENE, "farine", 50, Unite.MICRO_GRAMMES);

		
		Allergene adControl = new Allergene("farine",50,Unite.MICRO_GRAMMES);
		
		assertEquals(ingred.getName(), adControl.getName());
		assertEquals(ingred.getUnite(), adControl.getUnite());
		assertEquals(ingred.getValue(), adControl.getValue());
		assertEquals(ingred.getClass(), adControl.getClass());
		
	}

}
