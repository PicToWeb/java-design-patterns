package fr.diginamic.factory;

public enum Unite {

	MICRO_GRAMMES("Micro-grammes"), GRAMMES("Grammes"), KG("kilogrammes"), MILLI_GRAMMES("Milligrammes");
	
	private String libelle;

	/** Constructor
	 * @param libelle
	 */
	private Unite(String libelle) {
		this.libelle = libelle;
	}

	/** Getter for libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	
	

}
