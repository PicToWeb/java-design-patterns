package fr.diginamic.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProduitBuilderTest {

	@Test
	public void testAppendNom() throws ProduitException {
		ProduitBuilder prod = new ProduitBuilder("Vaporesso");
		 Produit produit = prod.build();

		assertEquals("Vaporesso", produit.getNom());
	}

	@Test
	public void testAppendGrade() {
		ProduitBuilder prod = new ProduitBuilder("Vaporesso");
	
		try {
			
			Produit produit = prod.appendGrade("FR").appendCategorie("Vapotte").appendMarque("Qree").appendIngredient("Lait", 100.25).build();
			
			
			assertEquals("FR", produit.getGrade());
			assertNotNull(produit.getMarque().getName());
			assertTrue(produit.getIngredients().size() ==1);
			
			Ingredient ing = produit.getIngredients().iterator().next();
			assertEquals("Lait",ing.getName());
			
			
		} catch (ProduitException e) {
			
			fail("test en echec");
		}
		
	}
	
	@Test
	public void testAppendCategorie() throws ProduitException {
		ProduitBuilder prod = new ProduitBuilder("Vaporesso");
		prod.appendCategorie("vapette");
		Produit produit = prod.build();
		
		assertEquals("vapette", produit.getCategorie().getName());
	}
	
	@Test
	public void testAppendIngredient() throws ProduitException {
		ProduitBuilder prod = new ProduitBuilder("Vaporesso");
		prod.appendIngredient("liquide",20.00);
		Produit produit = prod.build();
		Ingredient ingre = null;
		for (Ingredient i : produit.getIngredients())
		{
			ingre = i;
		}
		
		assertTrue(produit.getIngredients().contains(ingre));
	}
	
	

}
