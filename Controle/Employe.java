package Controle;

public abstract class Employe {
	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	protected Employe Superieur;

	public Employe(String matricule, String nom, double tarifJournalier) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
	}

	public String getMatricule() {
		return matricule;
	}

	public abstract double calculerCout(int nbJours);

	public void afficherDetails() {
		System.out.println("matricule" + matricule);
		System.out.println("nom" + nom);
		System.out.println("tarifJournalier" + tarifJournalier);
	}

	public Employe getSuperieur() {
		return Superieur;
	}

	public void setSuperieur(Employe superieur) {
		Superieur = superieur;
	}

}
