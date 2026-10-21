package Livraison;

public class Livraison {
  private double distance;
  private Livreur livreur;
  private Commande commande;
  public Livraison(double distance, Livreur livreur, Commande commande) {
	super();
	this.distance = distance;
	this.livreur = livreur;
	this.commande = commande;
  }
  public double calculerMontant() {
	  return livreur.calculerFrais(distance);
  }
  public void afficherRecapitulatif() {
	  System.out.println("les informations du livreur : " );
	  livreur.afficherDetails();
	  System.out.println("les informations de la commande : ");
	  System.out.println(commande);
	  System.out.println("la distance parcourue : "+distance+"KM");
	  System.out.println("le montant de la livraison : "+calculerMontant()+"DH");
	  
  }
}
