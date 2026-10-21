package Controle;

public class Mission {
	private int nbJours;
	private Employe employe;
	private Projet projet;

	public Mission(int nbJours, Employe employe, Projet projet) {
		super();
		this.nbJours = nbJours;
		this.employe = employe;
		this.projet = projet;
	}

	public double calculerMontant() {
		return employe.calculerCout(nbJours);
	}

	public void afficherRecapitulatif() {
		System.out.println("les informations de l’employé : ");
		employe.afficherDetails();
		System.out.println("les informations du projet :" + projet);
		System.out.println("la durée de la mission : " + nbJours);
		System.out.println("le montant calculé: " + calculerMontant());

	}
}
