package com.afpa.www.bean;

public class CompteLivretA extends Comptes{
    private double soldeCompteLivretA;
    private double tauxInterets = 1*0.03;

    public CompteLivretA(String nom, int id, double soldeCompteLivretA, String typeDeCompte) {
        super(nom, id, typeDeCompte);
        this.soldeCompteLivretA = soldeCompteLivretA;
    }

    public double getSoldeCompteLivretA() {
        return soldeCompteLivretA;
    }

    public void depotCompteLivretA(double depotCompteLivretA){
        this.soldeCompteLivretA = this.soldeCompteLivretA + depotCompteLivretA;
        System.out.println(getTypeDeCompte() + " de " + getNom() + " : vous avez déposé " + depotCompteLivretA + "€ sur votre " + getTypeDeCompte() + ", vous étiez à " + soldeCompteLivretA + "€, vous êtes maintenant à " + (soldeCompteLivretA+depotCompteLivretA) + "€.");
    }
    public void retraitCompteLivretA(double retraitCompteLivretA){
        if (soldeCompteLivretA >= retraitCompteLivretA ) {
            this.soldeCompteLivretA = this.soldeCompteLivretA - retraitCompteLivretA;
        } else {
            System.out.println(getTypeDeCompte() + " de " + getNom() + " : opération impossible, vous voulez faire un retrait plus élevé que le solde de votre compte bancaire");
        }
    }
    public String renseignementsCompteCLivretA(){
        return getTypeDeCompte() + " : le nom du client est " + getNom() + ", l'id est le " + getId() + ", le solde du compte est de : " + soldeCompteLivretA + "€, le taux d'interêt annuel est de 3% et donc à la fin de votre année, si vous restez à " + soldeCompteLivretA + "€ vous gagnerez " + soldeCompteLivretA*tauxInterets + "€, vous seriez donc à " + (soldeCompteLivretA+(soldeCompteLivretA*tauxInterets)) + "€.";
    }


}
