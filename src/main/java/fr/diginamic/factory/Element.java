package fr.diginamic.factory;

class Element {

	private String name;
	private int value;
	private Unite unite;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param value
	 * @param unite
	 */
	public Element(String name, int value, Unite unite) {
		this.name = name;
		this.value = value;
		this.unite = unite;
	}

	/**
	 * Getter for name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for value
	 * 
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Setter for value
	 * 
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * Getter for unite
	 * 
	 * @return the unite
	 */
	public Unite getUnite() {
		return unite;
	}

	/**
	 * Setter for unite
	 * 
	 * @param unite the unite to set
	 */
	public void setUnite(Unite unite) {
		this.unite = unite;
	}

}
