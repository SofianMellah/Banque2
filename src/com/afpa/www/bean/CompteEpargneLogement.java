package com.afpa.www.bean;

public class CompteEpargneLogement extends Comptes{

    private double soldeCompteEpargneLogement;
    private double tauxInteret = 1*0.05;

    public CompteEpargneLogement(String nom, int id, double soldeCompteEpargneLogement, double tauxInteret, String typeDeCompte) {
        super(nom, id, typeDeCompte);
        this.soldeCompteEpargneLogement = soldeCompteEpargneLogement;
        this.tauxInteret = tauxInteret;
    }

    public double getSoldeCompteEpargneLogement() {
        return soldeCompteEpargneLogement;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }
    public void depotCompteEpargneLogement(double depotCompteEpargneLogement){
        this.soldeCompteEpargneLogement = this.soldeCompteEpargneLogement + depotCompteEpargneLogement;
        System.out.println("Vous avez déposé " + depotCompteEpargneLogement + "€ sur votre " + getTypeDeCompte() + ", vous étiez à " + soldeCompteEpargneLogement + "€, vous êtes maintenant à " + (soldeCompteEpargneLogement+depotCompteEpargneLogement) + "€.");

    }
}
