package Livraison;

public class LivreurCamion extends Livreur {
	private double tauxMajoration;

	public LivreurCamion(String identifiant, String nom, double tarifKm, double tauxMajoration) {
		super(identifiant, nom, tarifKm);
		this.tauxMajoration = tauxMajoration;
	}

	@Override
	public double calculerFrais(double distance) {
		double MontantBase = tarifKm * distance;
		return MontantBase*(1+tauxMajoration);
	}

}
