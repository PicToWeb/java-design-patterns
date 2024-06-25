package fr.diginamic.singleton;

import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Set;

public class Singleton {
	
	private static final Singleton DONNEE = new Singleton();
	
	private HashMap<String,String> listDonnee = new HashMap<>();
	
	private Singleton() {
		init();
	}

	public static Singleton getInstance() {
		return DONNEE;
	}
	
	public String getValeur(String cle) {
		return listDonnee.get(cle);
	}
	
	public Set<String> getCles(){
		return listDonnee.keySet();
	}
	
	private void init() {
		ResourceBundle configuration = ResourceBundle.getBundle("configuration");
		configuration.keySet().stream()
        .forEach(key -> listDonnee.put(key, configuration.getString(key)));
		
	}
	public HashMap<String,String> getProprietes(){
		return listDonnee;
	}
	
}
