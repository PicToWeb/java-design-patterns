package fr.diginamic.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		Service s1 = new Service("DSIN");
		Service s2 = new Service("Big Data");
		Service s3 = new Service("Java Dev");
		
		s1.ajouterElement(s2);
		s1.ajouterElement(s3);
		
		Employe directeur = new Employe("RASPEY","Cecile",100000.00);
		Employe architecte = new Employe("BECHKAR","Bilel",8000.00);
		s1.ajouterElement(directeur);
		s1.ajouterElement(architecte);
		Employe chefService = new Employe("RANMEY","JB",7500.00);
		Employe concepteur = new Employe("DOE","Jan",3500.00);
		s2.ajouterElement(chefService);
		s2.ajouterElement(concepteur);
		Employe chefService2 = new Employe("GUINEAU","Kevin",7500.00);
		Employe leadDev = new Employe("MARTIN","Paul",3500.00);
		s3.ajouterElement(chefService2);
		s3.ajouterElement(leadDev);
		
		System.out.println(s1.calculerSalaire());
		System.out.println(s2.calculerSalaire());
		System.out.println(s3.calculerSalaire());

	}

}
