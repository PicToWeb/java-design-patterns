package fr.diginamic.composite;

public class Employe implements IElement {

	private String nom;
	private String prenom;
	private Double salaire;
	
	
	/** Constructor
	 * @param nom
	 * @param prenom
	 * @param salaire
	 */
	public Employe(String nom, String prenom, Double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}


	@Override
	public Double calculerSalaire() {
		
		return salaire;
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
	public void setNom(String nom) {
		this.nom = nom;
	}



	/** Getter for prenom
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/** Setter for prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/** Getter for salaire
	 * @return the salaire
	 */
	public Double getSalaire() {
		return salaire;
	}



	/** Setter for salaire
	 * @param salaire the salaire to set
	 */
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}




}
