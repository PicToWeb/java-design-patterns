package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement {

	private String nom;
	
	private List<IElement> elements = new ArrayList<>();
	
	/** Constructor
	 * @param nom
	 * @param prenom
	 * @param salaire
	 */
	public Service(String nom) {
		super();
		this.nom = nom;
	}


	@Override
    public Double calculerSalaire() {
        double totalSalaire = 0.0;
        for (IElement element : elements) {
            totalSalaire += element.calculerSalaire();
        }
        return totalSalaire;
    }
	
	public void ajouterElement(IElement element) {
        elements.add(element);
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




}
