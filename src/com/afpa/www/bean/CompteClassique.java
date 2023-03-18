package com.afpa.www.bean;

public class CompteClassique extends Comptes{
    private double soldeCompteClassique;
    private int decouvert = 200;

    public CompteClassique(String nom, int id, double soldeCompteClassique, String typeDeCompte) {
        super(nom, id, typeDeCompte);
        this.soldeCompteClassique = soldeCompteClassique;
    }

    public double getSoldeCompteClassique() {
        return soldeCompteClassique;
    }

    public void depotCompteClassique(double depotCompteClassique){
        if (depotCompteClassique > 0) {
            System.out.println(getTypeDeCompte() + " de " + getNom() + " : vous avez déposé " + depotCompteClassique + "€ sur votre " + getTypeDeCompte() + ", vous étiez à " + soldeCompteClassique + "€, vous êtes maintenant à " + (soldeCompteClassique + depotCompteClassique) + "€.");
            this.soldeCompteClassique = this.soldeCompteClassique + depotCompteClassique;
        } else {
            System.out.println(getTypeDeCompte() + " de " + getNom() + " : vous souhaitez faire un dépôt de " + depotCompteClassique + "€, merci de renseignez une somme valide pour pouvoir faire un dépot.");
        }
    }
    public void retraitCompteClassique(double retraitCompteClassique){
        if (soldeCompteClassique + decouvert > retraitCompteClassique) {
            System.out.println(getTypeDeCompte() + " de " + getNom() + " : vous venez de faire un retrait de " + retraitCompteClassique + "€, vous étiez à " + soldeCompteClassique + "€, vous êtes maintenant à " + (soldeCompteClassique-retraitCompteClassique) + "€.");
            this.soldeCompteClassique = this.soldeCompteClassique - retraitCompteClassique;
        } else {
            System.out.println(getTypeDeCompte() + " de " + getNom() + " : opération impossible, vous êtes à " + soldeCompteClassique + "€ et souhaitez faire un retrait de " + retraitCompteClassique + "€, vous dépassez donc de " + (soldeCompteClassique+decouvert-retraitCompteClassique) + "€ le découvert autorisé de " + decouvert + "€.");
        }
    }
    public String renseignementsCompteClassique(){
        return getTypeDeCompte() + " : le nom du client est " + getNom() + ", l'id est le " + getId() + ", le solde du compte est de : " + soldeCompteClassique + "€ et le découvert maximum autorisé est de " + decouvert + "€.";
    }
}
