package fr.diginamic.builder;


public class ProduitBuilder {
	
	private Produit produit;
	
	public ProduitBuilder() {
		this.produit = new Produit();
	}
	
	public ProduitBuilder appendNom(String nom) {
		produit.setNom(nom);
		return this;
	}
	public ProduitBuilder appendGrade(String grade) {
		produit.setGrade(grade);
		return this;
	}
	
	public ProduitBuilder appendCategorie(String categorie) {
		produit.setCategorie(new Categorie(categorie));
		return this;
	}
	
	public ProduitBuilder appendMarque(String marque) {
		produit.setMarque(new Marque(marque));
		return this;
	}
	
	public ProduitBuilder appendIngredient(String ingredient,double qteMilligrammes) {
		produit.getIngredients().add(new Ingredient(ingredient,qteMilligrammes));
		return this;
	}
	
	public ProduitBuilder appendAllergene(String allergene,double qteMilligrammes) {
		produit.getAllergenes().add(new Allergene(allergene,qteMilligrammes));
		return this;
	}
	
	public ProduitBuilder appendAdditif(String additif,double qteMilligrammes) {
		produit.getAdditifs().add(new Additif(additif,qteMilligrammes));
		return this;
	}
	/** Getter for produit
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}

}
