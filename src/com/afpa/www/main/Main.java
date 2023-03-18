package com.afpa.www.main;

import com.afpa.www.bean.CompteClassique;
import com.afpa.www.bean.CompteLivretA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CompteClassique fatimaCompteClassique = new CompteClassique("Fatima", 87, 500, "compte classique");
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        System.out.println("Souhaitez vous faire un dépot ou un retrait ? Oui/Non.");
        Scanner sc = new Scanner(System.in);
        String OuiOuNon = sc.next();
        if (OuiOuNon.equalsIgnoreCase("Oui")){
            System.out.println("Dépot ou retrait ?");
            String depotOuRetrait = sc.next();
            if (depotOuRetrait.equalsIgnoreCase("Dépot") || depotOuRetrait.equalsIgnoreCase("Depot")){
                System.out.println("Veuillez saisir le montant à déposer");
                double depot = sc.nextInt();
                fatimaCompteClassique.depotCompteClassique(depot);
                System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
            } else if (depotOuRetrait.equalsIgnoreCase("Retrait")){
                System.out.println("Veuillez saisir le montant à retirer");
                double retrait = sc.nextInt();
                fatimaCompteClassique.retraitCompteClassique(retrait);
                System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
            } else {
                System.out.println("Erreur, merci de réitérer la manipulation en précisant bien 'dépot' ou 'retrait'.");
            }
        }




        // Début compte classique
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        fatimaCompteClassique.depotCompteClassique(700);
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        fatimaCompteClassique.depotCompteClassique(-300);
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        fatimaCompteClassique.retraitCompteClassique(1500);
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        fatimaCompteClassique.retraitCompteClassique(1350);
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");

        // Fin compte classique


        // Début compte livret A
        CompteLivretA fatimaCompteLivretA = new CompteLivretA("Fatima", 87, 300, "compte livret A");
        System.out.println(fatimaCompteLivretA.renseignementsCompteCLivretA());
        fatimaCompteLivretA.depotCompteLivretA(500);
        System.out.println(fatimaCompteLivretA.renseignementsCompteCLivretA());
        System.out.println(fatimaCompteLivretA.renseignementsCompteCLivretA());
        // Fin compte livret A


        // Début compte épargne logement

        // Fin compte épargne logement
    }
}