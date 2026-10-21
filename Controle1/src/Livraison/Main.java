package Livraison;

public class Main {
	public static void main(String[] args) {
		Livreur lMoto1 = new LivreurMoto("M1", "amin alami", 10, 4);
		Livreur lMoto2 = new LivreurMoto("M2", "hafidi aymane", 8, 2);
		Livreur lCamion1 = new LivreurCamion("C1", "ilyasse salhi", 15, 0.20);
		Livreur lCamion2 = new LivreurCamion("C2", "hamza motawakil", 12, 0.10);
		Livreur livreurs[] = new Livreur[4];
		livreurs[0] = lMoto1;
		livreurs[1] = lMoto2;
		livreurs[2] = lCamion1;
		livreurs[3] = lCamion2;
		Commande commande1 = new Commande("229", "marrakech");
		Commande commande2 = new Commande("300", "agadir");
		lMoto2.setResponsable(lMoto1);
		lCamion1.setResponsable(lMoto1);
		lCamion2.setResponsable(lCamion1);
		for (Livreur l : livreurs) {
			l.afficherDetails();
			if (l.getResponsable() != null) {
				System.out.println("leur responsable : " + l.getResponsable().getNom());

			} else
				System.out.println("aucune  responsable ");
		}
		Livraison livraison1 = new Livraison(30, lMoto1, commande1);
		Livraison livraison2 = new Livraison(20, lMoto2, commande1);
		Livraison livraison3 = new Livraison(40, lCamion1, commande2);
		Livraison livraison4 = new Livraison(50, lCamion2, commande2);
		Livraison livraisons[] = new Livraison[4];
		livraisons[0] = livraison1;
		livraisons[1] = livraison2;
		livraisons[2] = livraison3;
		livraisons[3] = livraison4;
		double totale = 0;
		int nbrespnsables = 0;
		for (Livraison l : livraisons) {
			l.afficherRecapitulatif();
			totale += l.calculerMontant();
		}
		System.out.println("le montant total des livraisons :  " + totale + "DH");
		for (Livreur l : livreurs) {

			if (l.getResponsable() != null && l.getResponsable().nom.equals(lMoto1.nom))
				
			nbrespnsables++;
		}
		System.out.println("le nombre de livreurs directement supervisés par le premier livreur à moto = "+nbrespnsables);
	}

}
