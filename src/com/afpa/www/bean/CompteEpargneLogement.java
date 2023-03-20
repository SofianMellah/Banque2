package com.afpa.www.bean;

public class CompteEpargneLogement extends Comptes{

    private double soldeCompteEpargneLogement;
    private double tauxInteret = 1*0.05;
    private boolean autorisation = false;

    public CompteEpargneLogement(String nom, int id, double soldeCompteEpargneLogement, String typeDeCompte) {
        super(nom, id, typeDeCompte);
        this.soldeCompteEpargneLogement = soldeCompteEpargneLogement;
    }

    public double getSoldeCompteEpargneLogement() {
        return soldeCompteEpargneLogement;
    }

    public void depotCompteEpargneLogement(double depotCompteEpargneLogement){
        this.soldeCompteEpargneLogement = this.soldeCompteEpargneLogement + depotCompteEpargneLogement;
        System.out.println("Vous avez déposé " + depotCompteEpargneLogement + "€ sur votre " + getTypeDeCompte() + ", vous étiez à " + soldeCompteEpargneLogement + "€, vous êtes maintenant à " + (soldeCompteEpargneLogement+depotCompteEpargneLogement) + "€.");
    }
    public void demandeAutorisation(){
        if (!this.autorisation) {
            this.autorisation = true;
            System.out.println("La demande a été validé.");
            System.out.println("Vous n'avez droit qu'à un seul retrait/virement sur votre compte épargne logement, donc vider le compte entièrement, votre compte sera donc cloturer après ce ratrait/virement.");
            System.out.println("Voulez vous quand même faire un retrait ? Oui/Non.");
       } else {
            System.out.println("Vous n'êtes pas autorisé à faire cette démarche, bonne journée.");
        }
    }
    public void retraitCompteEpargneLogement(){

        if (autorisation) {
            System.out.println("Vous venez de retirer la totalité de votre solde (" + soldeCompteEpargneLogement + "€), votre compte va être maintenant cloturé. Bonne journée.");
            this.soldeCompteEpargneLogement = 0;
        }
    }

    public String renseignementsCompteEpargneLogement(){
        return getTypeDeCompte() + " : le nom du client est " + getNom() + ", l'id est le " + getId() + ", le solde du compte est de : " + soldeCompteEpargneLogement + "€, le taux d'interêt annuel est de " + tauxInteret*100 + "% et donc à la fin de votre année, si vous restez à " + soldeCompteEpargneLogement + "€ vous gagnerez " + soldeCompteEpargneLogement*tauxInteret + "€, vous seriez donc à " + (soldeCompteEpargneLogement+(soldeCompteEpargneLogement*tauxInteret)) + "€.";
    }
}
