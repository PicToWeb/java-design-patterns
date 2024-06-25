package fr.diginamic.builder;

class Additif {

	String name;
	double qteMilligrammes;
	
	/** Constructor
	 * @param name
	 * @param qteMilligrammes
	 */
	public Additif(String name, double qteMilligrammes) {
		super();
		this.name = name;
		this.qteMilligrammes = qteMilligrammes;
	}

	/** Getter for name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/** Setter for name
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}

	/** Getter for qteMilligrammes
	 * @return the qteMilligrammes
	 */
	public double getQteMilligrammes() {
		return qteMilligrammes;
	}

	/** Setter for qteMilligrammes
	 * @param qteMilligrammes the qteMilligrammes to set
	 */
	void setQteMilligrammes(double qteMilligrammes) {
		this.qteMilligrammes = qteMilligrammes;
	}
	
	
	
	

}
