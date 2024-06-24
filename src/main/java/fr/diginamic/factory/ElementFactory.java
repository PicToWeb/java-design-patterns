package fr.diginamic.factory;

public class ElementFactory {
	
	public static Element getInstance(ElementType elementType, String nom, int valeur, Unite unite) {
        switch (elementType) {
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            default:
               return null;
        }
    }
}
