package fr.diginamic.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProduitBuilderTest {

	@Test
	public void testAppendNom() {
		ProduitBuilder prod = new ProduitBuilder();
		 prod.appendNom("Vaporesso");
		 Produit produit = prod.getProduit();

		assertEquals("Vaporesso", produit.getNom());
	}

	@Test
	public void testAppendGrade() {
		ProduitBuilder prod = new ProduitBuilder();
		prod.appendGrade("FR");
		Produit produit = prod.getProduit();
		
		assertEquals("FR", produit.getGrade());
	}
	
	@Test
	public void testAppendCategorie() {
		ProduitBuilder prod = new ProduitBuilder();
		prod.appendCategorie("vapette");
		Produit produit = prod.getProduit();
		
		assertEquals("vapette", produit.getCategorie().getName());
	}
	
	@Test
	public void testAppendIngredient() {
		ProduitBuilder prod = new ProduitBuilder();
		prod.appendIngredient("liquide",20.00);
		Produit produit = prod.getProduit();
		Ingredient ingre = null;
		for (Ingredient i : produit.getIngredients())
		{
			ingre = i;
		}
		
		assertTrue(produit.getIngredients().contains(ingre));
	}
	
	

}
