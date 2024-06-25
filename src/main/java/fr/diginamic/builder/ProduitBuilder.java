package fr.diginamic.builder;


public class ProduitBuilder {
	
	private Produit produit;
	
	public ProduitBuilder(String nom) {
		this.produit = new Produit(nom);
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
	
	public ProduitBuilder appendIngredient(String ingredient,double qteMilligrammes) throws ProduitException {
		if(qteMilligrammes<=0) {
			throw new ProduitException("La quantité d'un ingrédients doit etre strictement positif");
		}
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
	public Produit build() throws ProduitException {
		
		if(produit.getCategorie() ==null) {
			throw new ProduitException("La catégorie est obligatoire");
		}
		if(produit.getMarque() ==null) {
			throw new ProduitException("La marque est obligatoire");
		}
		if(produit.getIngredients() ==null) {
			throw new ProduitException("Le produit doit contenir au moins un ingrédient");
		}
		return produit;
	}

}
