package fr.diginamic.builder;

import java.util.HashSet;
import java.util.Set;

public class Produit {

	protected String nom;
	protected String grade;
	protected Categorie categorie;
	protected Marque marque ;
	protected Set <Additif> additifs = new HashSet<>();
	protected Set <Allergene> allergenes = new HashSet<>();;
	protected Set<Ingredient> ingredients = new HashSet<>();
	
	/** Constructor
	 * @param nom
	 * @param grade
	 */
	Produit(String nom) {
		this.nom = nom;
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter for grade
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/** Setter for grade
	 * @param grade the grade to set
	 */
	void setGrade(String grade) {
		this.grade = grade;
	}

	

	/** Getter for additifs
	 * @return the additifs
	 */
	public Set<Additif> getAdditifs() {
		return additifs;
	}

	/** Setter for additifs
	 * @param additifs the additifs to set
	 */
	void setAdditifs(Set<Additif> additifs) {
		this.additifs = additifs;
	}

	/** Getter for allergenes
	 * @return the allergenes
	 */
	public Set<Allergene> getAllergenes() {
		return allergenes;
	}

	/** Setter for allergenes
	 * @param allergenes the allergenes to set
	 */
	void setAllergenes(Set<Allergene> allergenes) {
		this.allergenes = allergenes;
	}

	/** Getter for ingredients
	 * @return the ingredients
	 */
	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	/** Setter for ingredients
	 * @param ingredients the ingredients to set
	 */
	void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/** Getter for categorie
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/** Setter for categorie
	 * @param categorie the categorie to set
	 */
	void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/** Getter for marque
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}

	/** Setter for marque
	 * @param marque the marque to set
	 */
	void setMarque(Marque marque) {
		this.marque = marque;
	}


		
}
