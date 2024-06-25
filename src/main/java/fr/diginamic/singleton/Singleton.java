package fr.diginamic.singleton;

import java.util.HashMap;
import java.util.ResourceBundle;

public class Singleton {
	
	private static final Singleton DONNEE = new Singleton();
	
	private HashMap<String,String> listDonnee = new HashMap<>();
	
	private Singleton() {
		init();
	}

	public static Singleton getInstance() {
		return DONNEE;
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
