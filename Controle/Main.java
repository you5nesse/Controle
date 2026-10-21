package Controle;

public class Main {
	public static void main(String[] args) {
		Employe Ingenieur1 = new Ingenieur("A2020", "Ahmed", .500, 4);
		Employe Ingenieur2 = new Ingenieur("B7899", "amin", 350, 2);
		Employe commercial1 = new Commercial("C7829", "hamza", 300, 0.10);
		Employe commercial2 = new Commercial("D9726", "younesse", 400, 0.15);
		Employe[] employes = new Employe[5];
		employes[0] = Ingenieur1;
		employes[1] = Ingenieur2;
		employes[2] = commercial1;
		employes[3] = commercial2;
		Projet projet1 = new Projet("P1", "");
		Projet projet2 = new Projet("P2", "");
		Ingenieur2.setSuperieur(Ingenieur1);
		commercial1.setSuperieur(Ingenieur1);
		commercial2.setSuperieur(commercial1);
		for (Employe e : employes) {
			e.afficherDetails();
			System.out.println(" leur supérieur " + e.getSuperieur().nom);
		}
		Mission m1 = new Mission(4, commercial1, projet1);
		Mission m2 = new Mission(2, commercial2, projet1);
		Mission m3 = new Mission(3, Ingenieur1, projet2);
		Mission m4 = new Mission(2, Ingenieur2, projet2);
		Mission[] missions = new Mission[4];
		missions[0] = m1;
		missions[1] = m2;
		missions[2] = m3;
		missions[3] = m4;
		double totale = 0.0;
		for (Mission m : missions) {
			m.afficherRecapitulatif();
			totale += m.calculerMontant();
		}
		System.out.println("le montant total de toutes les missions : " + totale);
		int nbemployes = 0;
		for (Employe e : employes) {
			if (e.getSuperieur().nom.equals(Ingenieur1.nom)) {
				nbemployes++;
			}

		}
		System.out.println("le nombre d’employés directement supervisés par le premier ingénieur = " + nbemployes);
	}
}
